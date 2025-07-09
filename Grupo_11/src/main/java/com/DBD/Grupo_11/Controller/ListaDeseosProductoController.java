package com.DBD.Grupo_11.Controller;

import com.DBD.Grupo_11.Entity.ListaDeseosProducto;
import com.DBD.Grupo_11.Repository.ListaDeseosProductoRepository;
import com.DBD.Grupo_11.Service.ListaDeseosProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/listadedeseosproducto")
public class ListaDeseosProductoController {
    @Autowired
    private ListaDeseosProductoRepository listaDeseosProductoRepository;
    @Autowired
    private ListaDeseosProductoService listaDeseosProductoService;

    @PostMapping("/saveListaDeseosProducto")
    public ListaDeseosProducto saveListaDeseosProducto(@RequestBody ListaDeseosProducto listaDeseosProducto) {return listaDeseosProductoService.save(listaDeseosProducto);}

    @GetMapping("/findByIdListaDeseosProducto/{id}")
    public ListaDeseosProducto findByIdListaDeseosProducto(@PathVariable Long id) {return listaDeseosProductoService.getById(id);}

    @GetMapping("/findAll")
    public List<ListaDeseosProducto> findAll() {return listaDeseosProductoService.findAll();}

    @GetMapping("/update")
    public void updateListaDeseosProducto(@RequestBody ListaDeseosProducto listaDeseosProducto){ listaDeseosProductoService.update(listaDeseosProducto); }

    @GetMapping
    public Optional<ListaDeseosProducto> findByListaDeDeseos_IdListaDeDeseos(Long idLista){
        return listaDeseosProductoRepository.findByListaDeDeseos_IdListaDeDeseos(idLista);
    }
}
