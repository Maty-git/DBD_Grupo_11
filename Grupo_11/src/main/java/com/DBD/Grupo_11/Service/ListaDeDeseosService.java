package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.ListaDeDeseos;
import com.DBD.Grupo_11.Repository.ClienteRepository;
import com.DBD.Grupo_11.Repository.ListaDeDeseosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListaDeDeseosService {
    @Autowired
    private ListaDeDeseosRepository listaDeDeseosRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public ListaDeDeseos save(ListaDeDeseos listaDeDeseos){
        listaDeDeseosRepository.save(listaDeDeseos);
        return listaDeDeseos;
    }
    public ListaDeDeseos getById(Long id) {return listaDeDeseosRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Lista de Deseos no encontrado con ID: " + id));}

    public List<ListaDeDeseos> findAll(){ return listaDeDeseosRepository.findAll();}

    public void update(ListaDeDeseos listaDeDeseosUpdate){
        Long idListaDeDeseos = listaDeDeseosUpdate.getIdListaDeDeseos();
        ListaDeDeseos listaDeDeseos =  getById(idListaDeDeseos);

        listaDeDeseos.setCliente(listaDeDeseosUpdate.getCliente());
        listaDeDeseosRepository.save(listaDeDeseos);
    }

    public void delete(Long id) {listaDeDeseosRepository.deleteById(id);}
}
