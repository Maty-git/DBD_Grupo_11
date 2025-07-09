package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.Boleta;
import com.DBD.Grupo_11.Entity.CarroDeCompra;
import com.DBD.Grupo_11.Repository.BoletaRepository;
import com.DBD.Grupo_11.Service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boleta")
public class BoletaController {
    @Autowired
    private BoletaService boletaService;
    @Autowired
    private BoletaRepository boletaRepository;

    @PostMapping("/saveBoleta")
    public Boleta saveBoleta(@RequestBody Boleta boleta){
        return boletaService.save(boleta);
    }

    @GetMapping("/findByIdCliente_IdCliente/{idCliente}")
    public List<CarroDeCompra> findByIdCliente_IdCliente(Long idCliente){
        return boletaRepository.findByIdCliente_IdCliente(idCliente);
    }
    @GetMapping("/findByIdUbicacion_IdUbicacion/{idUbicacion}")
    public List<Boleta> findByIdUbicacion_IdUbicacion(Long idUbicacion){
        return boletaRepository.findByIdUbicacion_IdUbicacion(idUbicacion);
    }
}
