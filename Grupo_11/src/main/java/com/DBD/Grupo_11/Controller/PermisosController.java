package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Permisos;
import com.DBD.Grupo_11.Service.PermisosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permisos")
public class PermisosController {
    @Autowired
    private PermisosService permisosService;

    @PostMapping("/savePermisos")
    public Object savePermisos(@RequestBody Permisos permisos) {return permisosService.save(permisos);}

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable Long id){return permisosService.getById(id);}

    @GetMapping("/findAll")
    public List<Permisos> findAll(){return permisosService.findAll();}

    @GetMapping("/update")
    public void updatePermisos(@RequestBody Permisos permisos){ permisosService.update(permisos); }

    @GetMapping("/delete/{id}")
    public void deletePermisos(@PathVariable Long id){permisosService.delete(id);}
}
