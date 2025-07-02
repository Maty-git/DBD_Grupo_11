package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "juego_de_mesa")
public class JuegoDeMesa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJuegoDeMesa;
    private String tipoJuegoMesa;
    private String tipoDeJuego;
    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
