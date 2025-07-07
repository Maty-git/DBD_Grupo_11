package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Permisos;
import com.DBD.Grupo_11.Repository.PermisosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermisosService {
    @Autowired
    private PermisosRepository permisosRepository;

    public Permisos save(Permisos permisos){
        permisosRepository.save(permisos);
        return permisos;
    }

    public Permisos getById(Long id){
        return permisosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin no encontrado con ID: " + id));}

    public List<Permisos> findAll(){return permisosRepository.findAll();}

    public void update(Permisos permisosUpdate){
        Long idPermisos = permisosUpdate.getIdPermiso();
        Permisos permisos = getById(idPermisos);

        permisos.setPermisosCliente(permisosUpdate.getPermisosCliente());
        permisos.setPermisosJefe(permisosUpdate.getPermisosJefe());
        permisos.setPermisosGlobales(permisosUpdate.getPermisosGlobales());
        permisosRepository.save(permisos);
    }

    public void delete(Long id){ permisosRepository.delete(getById(id));}
}
