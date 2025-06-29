package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "permisos")
public class Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPermiso;
    private String permisosCliente;
    private String permisosJefe;
    private String permisosGlobales;
}
