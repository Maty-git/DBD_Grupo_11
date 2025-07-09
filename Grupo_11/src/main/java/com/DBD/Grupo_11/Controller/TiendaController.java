package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Tienda;
import com.DBD.Grupo_11.Service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tienda")
public class TiendaController {
    @Autowired
    private TiendaService tiendaService;

    @PostMapping("/saveTienda")
    public Object saveTienda(@RequestBody Tienda tienda) {return tiendaService.save(tienda);}

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable Long id){return tiendaService.getById(id);}

    @GetMapping("/findAll")
    public List<Tienda> findAll(){return tiendaService.findAll();}

    @GetMapping("/update")
    public void updateTienda(@RequestBody Tienda tienda){ tiendaService.update(tienda); }

    @GetMapping("/delete/{id}")
    public void deleteTienda(@PathVariable Long id){tiendaService.delete(id);}
}