package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carro_de_compra_boleta")
public class CarroDeCompraBoleta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarroDeCompraBoleta;
    @ManyToOne
    @JoinColumn(name = "id_carro_de_compra")
    private CarroDeCompra carroDeCompra;
    @ManyToOne
    @JoinColumn(name = "id_boleta")
    private Boleta boleta;
}
