package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.RankingCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingCartaRepository extends JpaRepository<RankingCarta, Long> {
    RankingCarta getById(Long id);
}
