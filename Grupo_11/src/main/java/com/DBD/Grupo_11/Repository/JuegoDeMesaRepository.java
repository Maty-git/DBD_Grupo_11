package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.JuegoDeMesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JuegoDeMesaRepository extends JpaRepository<JuegoDeMesa, Long> {
    JuegoDeMesa getById(Long id);
    @Query(value = "SELECT tipoJuegoMesa FROM JuegoDeMesa WHERE tipoJuegoMesa=tipo",  nativeQuery = true)
    Optional<JuegoDeMesa> findByTipoJuegoMesa(@Param("tipo") String tipo);
    @Query(value = "SELECT tipoDeJuego FROM JuegoDeMesa WHERE tipoDeJuego=tipo",   nativeQuery = true)
    Optional<JuegoDeMesa> findByTipoDeJuego(String tipo);
}
