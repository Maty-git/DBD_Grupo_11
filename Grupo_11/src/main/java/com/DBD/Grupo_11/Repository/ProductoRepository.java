package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Producto getById(Long id);
    List<Producto> findByUbicacionUsuario_IdUbicacion(Long idUbicacion);
    List<Producto> findByUbicacionTienda_IdUbicacionTienda(Long idUbicacion);
    List<Producto> findByNombreProductoContainingIgnoreCase(String nombre);
    List<Producto> findByStockProductoGreaterThan(int minStock);
    @Query("SELECT p FROM Producto p ORDER BY p.stockProducto DESC")
    List<Producto> productosConMasStock();
}
