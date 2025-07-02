package com.DBD.Grupo_11.Repository;

<<<<<<< HEAD
import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Entity.CarroDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroDeCompraRepository extends JpaRepository<CarroDeCompra, Long> {
=======
import com.DBD.Grupo_11.Entity.CarroDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarroDeCompraRepository extends JpaRepository <CarroDeCompra, Long> {
    CarroDeCompra getById(Long id);
>>>>>>> origin/main
}
