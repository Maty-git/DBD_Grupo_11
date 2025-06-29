package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carta")
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarta;
    private int annoCarta;
    private String estadoCarta;
    private String rarezaCarta;
    private String tipoDeJuego;
    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
