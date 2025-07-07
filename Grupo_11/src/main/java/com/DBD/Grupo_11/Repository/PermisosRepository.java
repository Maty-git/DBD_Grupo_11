package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos,Long> {
    Permisos getById(Long id);
}
