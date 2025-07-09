package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Boleta;
import com.DBD.Grupo_11.Entity.CarroDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Long> {
    List<CarroDeCompra> findByIdCliente_IdCliente(Long idCliente);
    List<Boleta> findByIdUbicacion_IdUbicacion(Long idUbicacion);
}
