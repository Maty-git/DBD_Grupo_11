package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.ListaDeDeseos;
import com.DBD.Grupo_11.Repository.ListaDeDeseosRepository;
import com.DBD.Grupo_11.Service.ListaDeDeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/listadedeseos")
public class ListaDeDeseosController {
    @Autowired
    private ListaDeDeseosService listaDeDeseosService;

    @Autowired
    private ListaDeDeseosRepository listaDeDeseosRepository;

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

    @GetMapping("/findByCliente_IdCliente/{idCliente}")
    public Optional<ListaDeDeseos> findByCliente_IdCliente(Long idCliente){
        return listaDeDeseosRepository.findByCliente_IdCliente(idCliente);
    }
}
