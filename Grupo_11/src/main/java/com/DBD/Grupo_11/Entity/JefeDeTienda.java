package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "")
public class JefeDeTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJefeDeTienda;
    private String correoJefe;
    private String nombreJefe;
    private String contrasennaJefe;
    @OneToOne
    @JoinColumn(name = "id_permisos")
    private Permisos permisos;
}
