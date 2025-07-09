package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Valoracion;
import com.DBD.Grupo_11.Repository.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoracionService {
    @Autowired
    private ValoracionRepository valoracionRepository;

    public List<Valoracion> findAll(){ return  valoracionRepository.findAll(); }

    public Valoracion getById(Long id){
        return valoracionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Valoracion no encontrado con ID: " + id));
    }

    public Valoracion save(Valoracion valoracion){
        valoracionRepository.save(valoracion);
        return valoracion;
    }

    public void update(Valoracion valoracionUpdate){
        Long idValoracion = valoracionUpdate.getIdValoracion();
        Valoracion valoracion = getById(idValoracion);

        valoracion.setComentarioValoracion(valoracionUpdate.getComentarioValoracion());
        valoracion.setPuntajeValoracion(valoracionUpdate.getPuntajeValoracion());
        valoracionRepository.save(valoracion);
    }

    public void delete(Long id){
        valoracionRepository.deleteById(id);
    }
}
