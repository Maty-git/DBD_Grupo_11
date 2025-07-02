package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carro_de_compra_producto")
public class CarroDeCompraProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarroDeCompraProducto;
/*
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto idProducto;
*/
    @ManyToOne
    @JoinColumn(name = "id_carro_de_compra")
    private CarroDeCompra idCarroDeCompra;

    private int stockCarro;
}
