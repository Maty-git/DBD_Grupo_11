package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ubicacion_tienda")
public class UbicacionTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUbicacionTienda;
    private String comunaTienda;
    private String calleTienda;
    private String ciudadTienda;
    @OneToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;
}
