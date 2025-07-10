package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.*;
import com.DBD.Grupo_11.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private TiendaRepository tiendaRepository;

    @Autowired
    private JefeDeTiendaRepository jefeDeTiendaRepository;

    @Autowired
    private UbicacionUsuarioRepository ubicacionUsuarioRepository;

    @Autowired
    private UbicacionTiendaRepository ubicacionTiendaRepository;

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    public Producto getById(Long id){
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));
    }

    public Producto save(Producto producto){
        Long ti = producto.getTienda().getIdTienda();
        Tienda tienda = tiendaRepository.getById(ti);
        JefeDeTienda jefe = jefeDeTiendaRepository.getReferenceById(producto.getJefeDeTienda().getIdJefeDeTienda());
        UbicacionTienda ubicaciontienda = ubicacionTiendaRepository.getById(producto.getUbicacionTienda().getIdUbicacionTienda());
        UbicacionUsuario ubicacionusuario = ubicacionUsuarioRepository.getById(producto.getUbicacionUsuario().getIdUbicacion());

        producto.setTienda(tienda);
        producto.setJefeDeTienda(jefe);
        producto.setUbicacionTienda(ubicaciontienda);
        producto.setUbicacionUsuario(ubicacionusuario);
        return productoRepository.save(producto);
    }

    public void update(Producto productoUpdate) {
        Long idProducto = productoUpdate.getIdProducto();
        Producto producto = getById(idProducto);

        producto.setStockProducto(productoUpdate.getStockProducto());
        producto.setPrecioProducto(productoUpdate.getPrecioProducto());
        producto.setUrlProducto(productoUpdate.getUrlProducto());
        producto.setNombreProducto(productoUpdate.getNombreProducto());
        producto.setJefeDeTienda(productoUpdate.getJefeDeTienda());
        producto.setUbicacionUsuario(productoUpdate.getUbicacionUsuario());
        producto.setTienda(productoUpdate.getTienda());
        producto.setUbicacionTienda(productoUpdate.getUbicacionTienda());
        productoRepository.save(producto);
    }

    public void delete(Long id){
        productoRepository.deleteById(id);
    }

}
