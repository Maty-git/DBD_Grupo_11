package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.JefeDeTienda;
import com.DBD.Grupo_11.Repository.JefeDeTiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JefeDeTiendaService {

    @Autowired
    private JefeDeTiendaRepository jefeRepo;

    public List<JefeDeTienda> obtenerTodos() {
        return jefeRepo.findAll();
    }

    public Optional<JefeDeTienda> obtenerPorId(Long id) {
        return jefeRepo.findById(id);
    }

    public JefeDeTienda guardar(JefeDeTienda jefe) {
        return jefeRepo.save(jefe);
    }

    public void eliminar(Long id) {
        jefeRepo.deleteById(id);
    }

    public JefeDeTienda actualizar(Long id, JefeDeTienda jefeActualizado) {
        return jefeRepo.findById(id).map(jefe -> {
            jefe.setCorreoJefe(jefeActualizado.getCorreoJefe());
            jefe.setNombreJefe(jefeActualizado.getNombreJefe());
            jefe.setContraseniaJefe(jefeActualizado.getContraseniaJefe());
            jefe.setPermisos(jefeActualizado.getPermisos());
            return jefeRepo.save(jefe);
        }).orElse(null);
    }
}
