package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
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
