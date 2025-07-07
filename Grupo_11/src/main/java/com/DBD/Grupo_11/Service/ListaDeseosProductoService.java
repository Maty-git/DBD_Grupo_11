package com.DBD.Grupo_11.Service;

import com.DBD.Grupo_11.Entity.ListaDeseosProducto;
import com.DBD.Grupo_11.Repository.AdminRepository;
import com.DBD.Grupo_11.Repository.ListaDeDeseosRepository;
import com.DBD.Grupo_11.Repository.ListaDeseosProductoRepository;
import com.DBD.Grupo_11.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListaDeseosProductoService {
    @Autowired
    private ListaDeseosProductoRepository listaDeseosProductoRepository;
    @Autowired
    private ListaDeDeseosRepository listaDeDeseosRepository;
    @Autowired
    private ProductoRepository productoRepository;

    public ListaDeseosProducto save(ListaDeseosProducto listaDeseosProducto) {
        listaDeseosProductoRepository.save(listaDeseosProducto);
        return listaDeseosProducto;
    }
    public ListaDeseosProducto getById(Long id) {
        return listaDeseosProductoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin no encontrado con ID: " + id));
    }
    public List<ListaDeseosProducto> findAll(){return listaDeseosProductoRepository.findAll();}

    public void update(ListaDeseosProducto listaDeseosProductoUpdate) {
        Long idListaDeseosProducto = listaDeseosProductoUpdate.getIdListaDeseosProducto();
        ListaDeseosProducto listaDeseosProducto = getById(idListaDeseosProducto);

        listaDeseosProducto.setListaDeDeseos(listaDeseosProducto.getListaDeDeseos());
        listaDeseosProducto.setProducto(listaDeseosProducto.getProducto());
        listaDeseosProductoRepository.save(listaDeseosProducto);
    }

    public void delete(Long id) {listaDeseosProductoRepository.deleteById(id);}



}
