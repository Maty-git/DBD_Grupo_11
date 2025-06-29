package com.DBD.Grupo_11.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCompra ;
    private String medioDePago;
    private Date fechaCompra;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion")
    private UbicacionUsuario idUbicacion;

}
