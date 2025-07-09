package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.ProductoValoracion;
import com.DBD.Grupo_11.Service.ProductoValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productovaloracion")
public class ProductoValoracionController {
    @Autowired
    private ProductoValoracionService productoValoracionService;

    @PostMapping("/saveProductoValoracion")
    public ProductoValoracion saveProductoValoracion(@RequestBody ProductoValoracion productoValoracion){
        return productoValoracionService.save(productoValoracion);
    }

    @GetMapping("/findByIdProductoValoracion/{id}")
    public ProductoValoracion findByIdProductoValoracion(@PathVariable Long id){
        return productoValoracionService.getById(id);
    }

    @GetMapping("/findAll")
    public List<ProductoValoracion> findAll(){
        return productoValoracionService.findAll();
    }

    @GetMapping("/update")
    public void updateProductoValoracion(@RequestBody ProductoValoracion productoValoracion){
        productoValoracionService.update(productoValoracion);
    }

    @GetMapping("/delete/{id}")
    public void deleteProductoValoracion(@PathVariable Long id){
        productoValoracionService.delete(id);
    }
}
