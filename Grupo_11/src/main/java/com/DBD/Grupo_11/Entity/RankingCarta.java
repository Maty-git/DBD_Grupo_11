package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ranking_carta")
public class RankingCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rankingCarta;
    private String topCartas;
    @OneToOne
    @JoinColumn(name = "id_carta")
    private Carta carta;
}
