package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Valoracion;
import com.DBD.Grupo_11.Service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/valoracion")
public class ValoracionController {
    @Autowired
    private ValoracionService valoracionService;

    @PostMapping("/saveValoracion")
    public Valoracion saveValoracion(@RequestBody Valoracion valoracion){
        return valoracionService.save(valoracion);
    }

    @GetMapping("/findByIdValoracion/{id}")
    public Valoracion findByIdValoracion(@PathVariable Long id){
        return valoracionService.getById(id);
    }

    @GetMapping("/findAll")
    public List<Valoracion> findAll(){
        return valoracionService.findAll();
    }

    @GetMapping("/update")
    public void updateValoracion(@RequestBody Valoracion valoracion){
        valoracionService.update(valoracion);
    }

    @GetMapping("/delete/{id}")
    public void deleteValoracion(@PathVariable Long id){
        valoracionService.delete(id);
    }

}
