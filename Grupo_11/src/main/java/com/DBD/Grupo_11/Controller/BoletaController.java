package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Boleta;
import com.DBD.Grupo_11.Service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boleta")
public class BoletaController {
    @Autowired
    private BoletaService boletaService;

    @PostMapping("/saveBoleta")
    public Boleta saveBoleta(@RequestBody Boleta boleta){
        return boletaService.save(boleta);
    }

}
