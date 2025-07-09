package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Long> {
    List<Carta> findByRarezaCarta(String rareza);
    List<Carta> findByEstadoCarta(String estado);
    List<Carta> findByAnnoCarta(int anno);
    List<Carta> findByTipoDeJuego(String tipo);
}
