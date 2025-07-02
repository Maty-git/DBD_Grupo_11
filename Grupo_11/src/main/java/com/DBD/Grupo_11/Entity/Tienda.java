package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTienda;
    private String nombreTienda;
    private String ubicacionTienda;
    @OneToOne
    @JoinColumn(name = "id_jefe_tienda")
    private JefeDeTienda jefeDeTienda;
}
