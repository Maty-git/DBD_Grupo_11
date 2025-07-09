package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ubicacion_tienda")
public class UbicacionTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUbicacionTienda;
    private String comunaTienda;
    private String calleTienda;
    private String ciudadTienda;
    @OneToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;
}
