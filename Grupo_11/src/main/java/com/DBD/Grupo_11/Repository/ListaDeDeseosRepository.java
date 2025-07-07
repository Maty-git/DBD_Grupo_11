package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Cliente;
import com.DBD.Grupo_11.Entity.ListaDeDeseos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaDeDeseosRepository extends JpaRepository<ListaDeDeseos, Long> {
    ListaDeDeseos getById(Long id);
}
