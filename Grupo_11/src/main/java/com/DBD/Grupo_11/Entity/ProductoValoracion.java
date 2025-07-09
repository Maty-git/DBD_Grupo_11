package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto_valoracion")
public class ProductoValoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProductoValoracion;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "id_valoracion")
    private Valoracion valoracion;
}
