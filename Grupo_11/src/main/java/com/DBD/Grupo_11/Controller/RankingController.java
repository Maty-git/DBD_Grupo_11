package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Ranking;
import com.DBD.Grupo_11.Service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ranking")
public class RankingController {
    @Autowired
    private RankingService rankingService;

    @PostMapping("/saveRanking")
    public Object saveRanking(@RequestBody Ranking ranking) {return rankingService.save(ranking);}

    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable int id){return rankingService.getById(id);}

    @GetMapping("/findAll")
    public List<Ranking> findAll(){return rankingService.findAll();}

    @GetMapping("/update")
    public void updateRanking(@RequestBody Ranking ranking){ rankingService.update(ranking); }

    @GetMapping("/delete/{id}")
    public void deleteRanking(@PathVariable Long id){rankingService.delete(id);}
}