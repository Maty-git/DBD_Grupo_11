package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Tienda;
import com.DBD.Grupo_11.Repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository tiendarepository;

    public Tienda save(Tienda tienda){
        tiendarepository.save(tienda);
        return tienda;
    }

    public Tienda getById(Long id){
        return tiendarepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tienda no encontrado con ID: " + id));}

    public List<Tienda> findAll(){return tiendarepository.findAll();}

    public void update(Tienda TiendaUpdate){
        Long idTienda = TiendaUpdate.getIdTienda();
        Tienda Tienda = getById(idTienda);

        Tienda.setJefeDeTienda(TiendaUpdate.getJefeDeTienda());
        Tienda.setNombreTienda(TiendaUpdate.getNombreTienda());
        Tienda.setUbicacionTienda(TiendaUpdate.getUbicacionTienda());

    }

    public void delete(Long id){ tiendarepository.delete(getById(id));}
}

