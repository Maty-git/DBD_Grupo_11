package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ubicacion_usuario")
public class UbicacionUsuario {
    @Id
    @Column(name = "id_ubicacion")
    private Long idUbicacion;

    private String comunaUsuario;
    private String ciudadUsuario;
    private String calleUsuario;

    @OneToOne
    @JoinColumn(name = "id_ubicacion")
    private Cliente idCliente;

    @OneToMany(mappedBy = "idUbicacion")
    private List<Boleta> idBoletas;
}
