package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.ListaDeseosProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListaDeseosProductoRepository extends JpaRepository<ListaDeseosProducto, Long> {
    ListaDeseosProducto getById(Long id);
    @Query(value = "SELECT * FROM ListaDeseosProdicto WHERE idListaDeDeseos=idLista", nativeQuery = true)
    Optional<ListaDeseosProducto> findByListaDeDeseos_IdListaDeDeseos(Long idLista);
}
