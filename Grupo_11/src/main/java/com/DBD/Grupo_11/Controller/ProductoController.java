package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Producto;
import com.DBD.Grupo_11.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/saveProducto")
    public Producto saveProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @GetMapping("/findByIdProducto/{id}")
    public Producto findByIdProducto(@PathVariable Long id){
        return productoService.getById(id);
    }

    @GetMapping("/findAll")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/update")
    public void updateProducto(@RequestBody Producto producto){
        productoService.update(producto);
    }

    @GetMapping("/delete/{id}")
    public void deleteProducto(@PathVariable Long id){
        productoService.delete(id);
    }
}
