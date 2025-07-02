package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Entity.CarroDeCompra;
import com.DBD.Grupo_11.Entity.CarroDeCompraProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroDeCompraProductoRepository extends JpaRepository<CarroDeCompraProducto, Long> {
}
