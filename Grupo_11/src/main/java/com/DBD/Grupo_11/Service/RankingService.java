package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.Ranking;
import com.DBD.Grupo_11.Repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingService {
    @Autowired
    private RankingRepository rankingrepository;

    public Ranking save(Ranking ranking){
        rankingrepository.save(ranking);
        return ranking;
    }

    public Ranking getById(Long id){
        return rankingrepository.findById(id);
    }

    public List<Ranking> findAll(){return rankingrepository.findAll();}

    public void update(Ranking RankingUpdate) {
        Long idRanking = RankingUpdate.getIdRanking();
        Ranking Ranking = getById(idRanking);

        Ranking.setTopProductos(RankingUpdate.getTopProductos());
        Ranking.setProducto(RankingUpdate.getProducto());
    }
    public void delete(Long id){ rankingrepository.delete(getById(id));}
}

