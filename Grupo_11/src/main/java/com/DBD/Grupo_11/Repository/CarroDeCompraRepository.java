package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.CarroDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroDeCompraRepository extends JpaRepository<CarroDeCompra, Long> {
    Optional<CarroDeCompra> findByIdCliente_IdCliente(Long idCliente);
}
