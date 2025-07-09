package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoracionRepository extends JpaRepository<Valoracion,Long> {
    Valoracion getById(Long id);
}