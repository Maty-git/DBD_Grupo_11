package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "carro_de_compra")
public class CarroDeCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarroDeCompra;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @OneToMany(mappedBy = "idCarroDeCompra")
    private List<CarroDeCompraBoleta> idCarroDeCompraBoleta;

    @OneToMany(mappedBy = "idCarroDeCompra")
    private List<CarroDeCompraProducto>  idCarroDeCompraProducto;


}
