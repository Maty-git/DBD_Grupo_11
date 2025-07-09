package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Cliente;
import com.DBD.Grupo_11.Entity.ListaDeDeseos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListaDeDeseosRepository extends JpaRepository<ListaDeDeseos, Long> {
    ListaDeDeseos getById(Long id);
    @Query(value = "SELECT * FROM ListaDeDeseos WHERE Cliente=idCliente", nativeQuery = true)
    Optional<ListaDeDeseos> findByCliente_IdCliente(Long idCliente);
}
