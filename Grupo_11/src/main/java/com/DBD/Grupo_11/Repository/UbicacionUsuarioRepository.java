package com.DBD.Grupo_11.Repository;


import com.DBD.Grupo_11.Entity.UbicacionUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionUsuarioRepository extends JpaRepository<UbicacionUsuario, Long> {
    UbicacionUsuario getById(Long id);
}
