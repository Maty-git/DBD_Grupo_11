package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.CarroDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroDeCompraRepository extends JpaRepository <CarroDeCompra, Long> {
}
