package com.DBD.Grupo_11.Service;


import com.DBD.Grupo_11.Entity.UbicacionTienda;
import com.DBD.Grupo_11.Repository.UbicacionTiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UbicacionTiendaService {
    @Autowired
    private UbicacionTiendaRepository ubicaciontiendarepository;

    public UbicacionTienda save(UbicacionTienda ubicacionTienda){
        ubicaciontiendarepository.save(ubicacionTienda);
        return ubicacionTienda;
    }

    public UbicacionTienda getById(Long id){
        return ubicaciontiendarepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ubicacion Tienda no encontrado con ID: " + id));}

    public List<UbicacionTienda> findAll(){return ubicaciontiendarepository.findAll();}

    public void update(UbicacionTienda UbicacionTiendaUpdate){
        Long idUbicacionTienda = UbicacionTiendaUpdate.getIdUbicacionTienda();
        UbicacionTienda UbicacionTienda = getById(idUbicacionTienda);

        UbicacionTienda.setComunaTienda(UbicacionTiendaUpdate.getComunaTienda());
        UbicacionTienda.setCalleTienda(UbicacionTiendaUpdate.getCalleTienda());
        UbicacionTienda.setCiudadTienda(UbicacionTiendaUpdate.getCiudadTienda());
        UbicacionTienda.setTienda(UbicacionTiendaUpdate.getTienda());

    }

    public void delete(Long id){ ubicaciontiendarepository.delete(getById(id));}
}
