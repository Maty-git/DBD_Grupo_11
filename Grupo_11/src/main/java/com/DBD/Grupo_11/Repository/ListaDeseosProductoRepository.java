package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.ListaDeseosProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaDeseosProductoRepository extends JpaRepository<ListaDeseosProducto, Long> {
    ListaDeseosProducto getById(Long id);
}
