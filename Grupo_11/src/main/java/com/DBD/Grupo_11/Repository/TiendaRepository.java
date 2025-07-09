package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda,Long> {
    Tienda getById(Long id);
}
