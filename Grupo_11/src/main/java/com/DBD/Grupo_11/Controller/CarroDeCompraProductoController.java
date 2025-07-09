package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.CarroDeCompraProducto;
import com.DBD.Grupo_11.Repository.CarroDeCompraProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carrodecompraproducto")
public class CarroDeCompraProductoController {
    @Autowired
    private CarroDeCompraProductoRepository carroDeCompraProductoRepository;

    @GetMapping("/findByIdCarroDeCompra_IdCarroDeCompra/{id}")
    public List<CarroDeCompraProducto> findByIdCarroDeCompra_IdCarroDeCompra(Long id){
        return carroDeCompraProductoRepository.findByIdCarroDeCompra_IdCarroDeCompra(id);
    };
}
