package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.JefeDeTienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JefeDeTiendaRepository extends JpaRepository<JefeDeTienda, Long> {
}
