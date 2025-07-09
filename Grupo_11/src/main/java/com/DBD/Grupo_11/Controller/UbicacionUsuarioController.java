package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.UbicacionUsuario;
import com.DBD.Grupo_11.Service.UbicacionUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicacionUsuario")
public class UbicacionUsuarioController {
    @Autowired
    private UbicacionUsuarioService ubicacionUsuarioService;

    @PostMapping("/saveUbicacionUsuario")
    public Object saveUbicacionUsuario(@RequestBody UbicacionUsuario ubicacionUsuario) {return ubicacionUsuarioService.save(ubicacionUsuario);}

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable Long id){return ubicacionUsuarioService.getById(id);}

    @GetMapping("/findAll")
    public List<UbicacionUsuario> findAll(){return ubicacionUsuarioService.findAll();}

    @GetMapping("/update")
    public void updateUbicacionUsuario(@RequestBody UbicacionUsuario ubicacionUsuario){ ubicacionUsuarioService.update(ubicacionUsuario); }

    @GetMapping("/delete/{id}")
    public void deleteUbicacionUsuario(@PathVariable Long id){ubicacionUsuarioService.delete(id);}
}