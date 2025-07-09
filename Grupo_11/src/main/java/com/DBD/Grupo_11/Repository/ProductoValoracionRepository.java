package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.ProductoValoracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoValoracionRepository extends JpaRepository<ProductoValoracion,Long> {
    ProductoValoracion getById(Long id);
}
