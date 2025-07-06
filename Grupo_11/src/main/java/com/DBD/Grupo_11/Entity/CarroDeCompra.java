package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
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
    private List<CarroDeCompraProducto>  idCarroDeCompraProducto;


}
