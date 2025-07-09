package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
