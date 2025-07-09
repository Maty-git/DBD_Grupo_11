package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.JefeDeTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JefeDeTiendaRepository extends JpaRepository<JefeDeTienda, Long> {
    Optional<JefeDeTienda> findByCorreoJefe(String correo);
}
