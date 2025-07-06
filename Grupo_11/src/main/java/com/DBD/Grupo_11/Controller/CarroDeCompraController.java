package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.CarroDeCompra;
import com.DBD.Grupo_11.Service.CarroDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carrodecompra")
public class CarroDeCompraController {

    @Autowired
    private CarroDeCompraService carroDeCompraService;

    // Obtener todos los carros
    @GetMapping("/getAllCarroDeCompra")
    public List<CarroDeCompra> getAll() {
        return carroDeCompraService.getAll();
    }

    // Obtener un carro por ID
    @GetMapping("/{id}")
    public ResponseEntity<CarroDeCompra> getById(@PathVariable Long id) {
        Optional<CarroDeCompra> carro = carroDeCompraService.getById(id);
        return carro.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear un nuevo carro
    @PostMapping("/saveCarroDeCompra")
    public CarroDeCompra create(@RequestBody CarroDeCompra carroDeCompra) {
        return carroDeCompraService.save(carroDeCompra);
    }

    // Actualizar un carro existente
    @PutMapping("/update/{id}")
    public ResponseEntity<CarroDeCompra> update(@PathVariable Long id, @RequestBody CarroDeCompra datosActualizados) {
        Optional<CarroDeCompra> carroOpt = carroDeCompraService.getById(id);
        if (carroOpt.isPresent()) {
            CarroDeCompra existente = carroOpt.get();

            existente.setIdCliente(datosActualizados.getIdCliente());

            // Guardar y devolver
            CarroDeCompra actualizado = carroDeCompraService.save(existente);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un carro por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (carroDeCompraService.getById(id).isPresent()) {
            carroDeCompraService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
