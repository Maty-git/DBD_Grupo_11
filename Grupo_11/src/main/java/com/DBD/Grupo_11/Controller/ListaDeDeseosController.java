package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.ListaDeDeseos;
import com.DBD.Grupo_11.Service.ListaDeDeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listadedeseos")
public class ListaDeDeseosController {
    @Autowired
    private ListaDeDeseosService listaDeDeseosService;

    @PostMapping("/saveListaDeDeseos")
    public ListaDeDeseos saveListaDeDeseos(@RequestBody ListaDeDeseos listaDeDeseos){ return listaDeDeseosService.save(listaDeDeseos); }

    @GetMapping("/findByIdListaDeDeseos/{id}")
    public Object findByIdListaDeDeseos(@PathVariable Long id){ return listaDeDeseosService.getById(id);}

    @GetMapping("/findAll")
    public List<ListaDeDeseos> findAll(){ return listaDeDeseosService.findAll();}

    @GetMapping("/update")
    public void updateListaDeDeseos(@RequestBody ListaDeDeseos listaDeDeseos){listaDeDeseosService.update(listaDeDeseos);}

    @GetMapping("/delete/{id}")
    public void deleteListaDeDeseos(@RequestBody Long id){listaDeDeseosService.delete(id);}
}
