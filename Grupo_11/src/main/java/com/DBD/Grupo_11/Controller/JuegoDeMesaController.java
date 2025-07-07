package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Admin;
import com.DBD.Grupo_11.Entity.JuegoDeMesa;
import com.DBD.Grupo_11.Repository.JuegoDeMesaRepository;
import com.DBD.Grupo_11.Service.JuegoDeMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/juegodemesa")
public class JuegoDeMesaController {
    @Autowired
    JuegoDeMesaRepository juegoDeMesaRepository;
    @Autowired
    private JuegoDeMesaService juegoDeMesaService;

    @PostMapping("/saveJuegoDeMesa")
    public JuegoDeMesa saveJuegoDeMesa(@RequestBody JuegoDeMesa juegoDeMesa) {
        return juegoDeMesaService.save(juegoDeMesa);
    }

    @GetMapping("/findByIdJuegoDeMesa/{id}")
    public Object  findByIdJuegoDeMesa(@PathVariable Long id){ return juegoDeMesaService.getById(id);}

    @GetMapping("/findall")
    public List<JuegoDeMesa> findAll(){ return juegoDeMesaService.findAll(); }

    @GetMapping("/update")
    public void updateJuegoDeMesa(@RequestBody JuegoDeMesa juegoDeMesa){ juegoDeMesaService.update(juegoDeMesa);}

    @GetMapping("/delete")
    public void deleteJuegoDeMesa(@RequestParam Long id){ juegoDeMesaService.delete(id);}
}
