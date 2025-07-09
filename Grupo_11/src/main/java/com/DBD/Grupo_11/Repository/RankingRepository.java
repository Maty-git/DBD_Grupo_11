package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankingRepository extends JpaRepository<Ranking,Integer> {
    Ranking findById(Long id);
}
