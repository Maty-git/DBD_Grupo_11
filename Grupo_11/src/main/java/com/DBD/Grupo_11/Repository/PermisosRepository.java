package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos,Long> {
    Permisos getById(Long id);
    @Query(value = "SELECT * FROM Permisos WHERE permisosClientes=nombre", nativeQuery = true)
    Optional<Permisos> findByPermisosCliente(String nombre);
}
