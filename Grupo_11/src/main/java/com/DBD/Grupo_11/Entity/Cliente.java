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


    @OneToOne(mappedBy = "idCliente")
    private UbicacionUsuario idUbicacion;

    @OneToMany(mappedBy = "idCliente")
    private List<Boleta> idBoletas;

    @OneToOne(mappedBy = "idCliente")
    private CarroDeCompra idCarroDeCompra;

    public Long getId() {
        return idCliente;
    }
}