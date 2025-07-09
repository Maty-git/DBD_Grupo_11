package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.JefeDeTienda;
import com.DBD.Grupo_11.Service.JefeDeTiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jefedetienda")
public class JefeDeTiendaController {

    @Autowired
    private JefeDeTiendaService jefeService;

    @GetMapping
    public List<JefeDeTienda> obtenerTodos() {
        return jefeService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<JefeDeTienda> obtenerPorId(@PathVariable Long id) {
        return jefeService.obtenerPorId(id);
    }

    @PostMapping
    public JefeDeTienda crear(@RequestBody JefeDeTienda jefe) {
        return jefeService.guardar(jefe);
    }

    @PutMapping("/{id}")
    public JefeDeTienda actualizar(@PathVariable Long id, @RequestBody JefeDeTienda jefe) {
        return jefeService.actualizar(id, jefe);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        jefeService.eliminar(id);
    }
}
