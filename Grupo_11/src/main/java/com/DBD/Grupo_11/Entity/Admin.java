package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "permisos_admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdmin;
    private String idCorreoAdmin;
    private String nombreAdmin;
    private String ubicacionAdmin;
    private String contraseniaAdmin;
    @OneToOne
    @JoinColumn(name = "id_permisos")
    private Permisos permisos;
}
