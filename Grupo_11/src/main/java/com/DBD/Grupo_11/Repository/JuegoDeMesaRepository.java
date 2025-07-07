package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.JuegoDeMesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoDeMesaRepository extends JpaRepository<JuegoDeMesa, Long> {
    JuegoDeMesa getById(Long id);
}
