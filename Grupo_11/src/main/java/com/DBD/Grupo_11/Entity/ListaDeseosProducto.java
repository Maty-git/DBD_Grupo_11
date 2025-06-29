package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lista_deseos_producto")
public class ListaDeseosProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idListaDeseosProducto;
    @ManyToOne
    @JoinColumn(name = "id_lista_deseos")
    private ListaDeDeseos listaDeDeseos;
    @ManyToOne
    @JoinColumn(name = "id_productos")
    private Producto producto;
}
