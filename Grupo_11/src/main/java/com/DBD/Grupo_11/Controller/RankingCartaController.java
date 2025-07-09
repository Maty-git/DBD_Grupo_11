package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.RankingCarta;
import com.DBD.Grupo_11.Service.RankingCartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rankingcarta")
public class RankingCartaController {
    @Autowired
    private RankingCartaService rankingCartaService;

    @PostMapping("/saveRankingCarta")
    public RankingCarta saveRankingCarta(@RequestBody RankingCarta rankingCarta){
        return rankingCartaService.save(rankingCarta);
    }

    @GetMapping("/findByIdRankingCarta/{id}")
    public RankingCarta findByIdRankingCarta(@PathVariable Long id){
        return rankingCartaService.getById(id);
    }

    @GetMapping("/findAll")
    public List<RankingCarta> findAll(){
        return rankingCartaService.findAll();
    }

    @GetMapping("/update")
    public void updateRankingCarta(@RequestBody RankingCarta rankingCarta){
        rankingCartaService.update(rankingCarta);
    }

    @GetMapping("/delete/{id}")
    public void deleteRankingCarta(@PathVariable Long id){
        rankingCartaService.delete(id);
    }
}
