package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lista_de_deseos")
public class ListaDeDeseos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idListaDeDeseos;
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
