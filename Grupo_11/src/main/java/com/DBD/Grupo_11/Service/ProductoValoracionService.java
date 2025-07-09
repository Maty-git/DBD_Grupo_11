package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.ProductoValoracion;
import com.DBD.Grupo_11.Repository.ProductoValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoValoracionService {
    @Autowired
    private ProductoValoracionRepository  productoValoracionRepository;

    public List<ProductoValoracion> findAll(){
        return productoValoracionRepository.findAll();
    }

    public ProductoValoracion getById(Long id){
        return productoValoracionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ProductoValoracion no encontrado con ID: " + id));
    }

    public ProductoValoracion save(ProductoValoracion productoValoracion){
        productoValoracionRepository.save(productoValoracion);
        return productoValoracion;
    }

    public void update(ProductoValoracion productoValoracionUpdate){
        Long idProductoValoracion = productoValoracionUpdate.getIdProductoValoracion();
        ProductoValoracion productoValoracion = getById(idProductoValoracion);

        productoValoracion.setValoracion(productoValoracionUpdate.getValoracion());
        productoValoracion.setProducto(productoValoracionUpdate.getProducto());
        productoValoracionRepository.save(productoValoracion);
    }

    public void delete(Long id){
        productoValoracionRepository.deleteById(id);
    }
}
