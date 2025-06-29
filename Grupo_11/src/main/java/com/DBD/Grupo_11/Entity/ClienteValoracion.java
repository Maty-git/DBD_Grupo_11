package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente_valoracion")
public class ClienteValoracion{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClienteValoracion;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_valoracion")
    private Valoracion valoracion;
}
