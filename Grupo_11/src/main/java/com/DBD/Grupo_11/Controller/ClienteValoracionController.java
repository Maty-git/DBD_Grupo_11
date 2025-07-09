package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.ClienteValoracion;
import com.DBD.Grupo_11.Service.ClienteValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientevaloracion")
public class ClienteValoracionController {

    @Autowired
    private ClienteValoracionService clienteValoracionService;

    @GetMapping
    public List<ClienteValoracion> getAll() {
        return clienteValoracionService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteValoracion> getById(@PathVariable Long id) {
        Optional<ClienteValoracion> cv = clienteValoracionService.getById(id);
        return cv.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ClienteValoracion create(@RequestBody ClienteValoracion clienteValoracion) {
        return clienteValoracionService.save(clienteValoracion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteValoracion> update(@PathVariable Long id, @RequestBody ClienteValoracion clienteValoracion) {
        Optional<ClienteValoracion> actualizado = clienteValoracionService.update(id, clienteValoracion);
        return actualizado.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (clienteValoracionService.getById(id).isPresent()) {
            clienteValoracionService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
