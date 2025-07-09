package com.DBD.Grupo_11.Repository;

import com.DBD.Grupo_11.Entity.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RankingRepository extends JpaRepository<Ranking,Integer> {
    Optional<Ranking> findById(Long id);
}
