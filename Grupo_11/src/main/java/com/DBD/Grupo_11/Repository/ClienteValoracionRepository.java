package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.ClienteValoracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteValoracionRepository extends JpaRepository<ClienteValoracion, Long> {
}
