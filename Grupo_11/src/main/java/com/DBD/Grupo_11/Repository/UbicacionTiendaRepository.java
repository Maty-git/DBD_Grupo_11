package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.UbicacionTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionTiendaRepository extends JpaRepository<UbicacionTienda, Long> {
    UbicacionTienda getById(Long id);
}
