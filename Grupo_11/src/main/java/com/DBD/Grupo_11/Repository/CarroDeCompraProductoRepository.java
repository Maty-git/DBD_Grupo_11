package com.DBD.Grupo_11.Repository;


import com.DBD.Grupo_11.Entity.CarroDeCompraProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarroDeCompraProductoRepository extends JpaRepository<CarroDeCompraProducto, Long> {
    List<CarroDeCompraProducto> findByIdCarroDeCompra_IdCarroDeCompra(Long id);
}
