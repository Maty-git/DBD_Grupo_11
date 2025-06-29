package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ranking")
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRanking;
    private String topProductos;
    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
