package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin getById(Long id);
}
