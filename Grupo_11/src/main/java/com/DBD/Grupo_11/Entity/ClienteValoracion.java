package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
