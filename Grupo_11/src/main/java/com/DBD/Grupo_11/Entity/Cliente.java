package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String nombreCliente;
    private String correoCliente;
    private String contraseniaCliente;

    private String idTienta;
    private String idPermisos;


    @OneToOne(
            mappedBy = "id_ubicacion"
    )
    private UbicacionUsuario idUbicacion;
}
