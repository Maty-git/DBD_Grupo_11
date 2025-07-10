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

    public Ranking getById(int id){
        return rankingrepository.getById(id);
    }

    public List<Ranking> findAll(){return rankingrepository.findAll();}

    public void update(Ranking RankingUpdate) {
        Long idRanking = RankingUpdate.getIdRanking();
        int i;
        for(i = 0; i < idRanking; i++){}
        Ranking Ranking = getById(i);

        Ranking.setTopProductos(RankingUpdate.getTopProductos());
        Ranking.setProducto(RankingUpdate.getProducto());
    }
    public void delete(Long id){
        int i;
        for(i = 0; i < id; i++){}
        rankingrepository.delete(getById(i));
    }
}

