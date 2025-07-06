package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @OneToMany(mappedBy = "idUbicacion")
    private List<Boleta> idBoletas;

    public Long getId() {
        return idUbicacion;
    }
}
