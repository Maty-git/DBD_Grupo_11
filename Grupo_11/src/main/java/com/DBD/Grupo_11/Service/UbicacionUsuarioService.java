package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.UbicacionUsuario;
import com.DBD.Grupo_11.Repository.UbicacionUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionUsuarioService {
    @Autowired
    private UbicacionUsuarioRepository ubicacionusuariorepository;

    public UbicacionUsuario save(UbicacionUsuario ubicacionUsuario){
        ubicacionusuariorepository.save(ubicacionUsuario);
        return ubicacionUsuario;
    }
    public UbicacionUsuario getById(Long id){
        return ubicacionusuariorepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ubicacion Tienda no encontrado con ID: " + id));}

    public List<UbicacionUsuario> findAll(){return ubicacionusuariorepository.findAll();}

    public void update(UbicacionUsuario UbicacionUsuarioUpdate){
        Long idUbicacionUsuario = UbicacionUsuarioUpdate.getIdUbicacion();
        UbicacionUsuario UbicacionUsuario = getById(idUbicacionUsuario);

        UbicacionUsuario.setComunaUsuario(UbicacionUsuarioUpdate.getComunaUsuario());
        UbicacionUsuario.setCiudadUsuario(UbicacionUsuarioUpdate.getCiudadUsuario());
        UbicacionUsuario.setCalleUsuario(UbicacionUsuarioUpdate.getCalleUsuario());
        UbicacionUsuario.setIdCliente(UbicacionUsuarioUpdate.getIdCliente());

    }
    public void delete(Long id){ ubicacionusuariorepository.delete(getById(id));}
}