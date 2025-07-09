package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.RankingCarta;
import com.DBD.Grupo_11.Repository.RankingCartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingCartaService {
    @Autowired
    private RankingCartaRepository rankingCartaRepository;

    public List<RankingCarta> findAll(){
        return rankingCartaRepository.findAll();
    }

    public RankingCarta getById(Long id){
        return rankingCartaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("RankingCarta no encontrado con ID: " + id));
    }

    public RankingCarta save(RankingCarta rankingCarta){
        rankingCartaRepository.save(rankingCarta);
        return rankingCarta;
    }

    public void update(RankingCarta rankingCartaUpdate){
        Long idRankingCarta = rankingCartaUpdate.getRankingCarta();
        RankingCarta rankingCarta = getById(idRankingCarta);

        rankingCarta.setTopCartas(rankingCartaUpdate.getTopCartas());
        rankingCarta.setCarta(rankingCartaUpdate.getCarta());
        rankingCartaRepository.save(rankingCarta);
    }

    public void delete(Long id){
        rankingCartaRepository.deleteById(id);
    }
}
