package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Carta;
import com.DBD.Grupo_11.Service.CartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carta")
public class CartaController {

    @Autowired
    private CartaService cartaService;

    // Obtener todas las cartas
    @GetMapping
    public List<Carta> getAll() {
        return cartaService.getAll();
    }

    // Obtener una carta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Carta> getById(@PathVariable Long id) {
        Optional<Carta> carta = cartaService.getById(id);
        return carta.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear una nueva carta
    @PostMapping
    public Carta create(@RequestBody Carta carta) {
        return cartaService.save(carta);
    }

    // Actualizar una carta existente
    @PutMapping("/{id}")
    public ResponseEntity<Carta> update(@PathVariable Long id, @RequestBody Carta cartaActualizada) {
        Optional<Carta> carta = cartaService.update(id, cartaActualizada);
        return carta.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar una carta por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (cartaService.getById(id).isPresent()) {
            cartaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
