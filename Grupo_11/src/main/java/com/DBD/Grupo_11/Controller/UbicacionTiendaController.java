package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.UbicacionTienda;
import com.DBD.Grupo_11.Service.UbicacionTiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacionTienda")
public class UbicacionTiendaController {
    @Autowired
    private UbicacionTiendaService ubicacionTiendaService;

    @PostMapping("/saveUbicacionTienda")
    public Object saveUbicacionTienda(@RequestBody UbicacionTienda ubicacionTienda) {return ubicacionTiendaService.save(ubicacionTienda);}

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable Long id){return ubicacionTiendaService.getById(id);}

    @GetMapping("/findAll")
    public List<UbicacionTienda> findAll(){return ubicacionTiendaService.findAll();}

    @GetMapping("/update")
    public void updateUbicacionTienda(@RequestBody UbicacionTienda ubicacionTienda){ ubicacionTiendaService.update(ubicacionTienda); }

    @GetMapping("/delete/{id}")
    public void deleteUbicacionTienda(@PathVariable Long id){ubicacionTiendaService.delete(id);}
}