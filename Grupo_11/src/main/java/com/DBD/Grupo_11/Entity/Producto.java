package com.DBD.Grupo_11.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto" )
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;
    private String urlProducto;
    private String nombreProducto;
    private int stockProducto;
    private int precioProducto;
    @ManyToOne
    @JoinColumn(name = "id_tienda")
    private Tienda tienda;
    @ManyToOne
    @JoinColumn(name = "id_jefe")
    private JefeDeTienda JefeDeTienda;
    @ManyToOne
    @JoinColumn(name = "id_ubicacion_usuario")
    private UbicacionUsuario ubicacionUsuario;
    @ManyToOne
    @JoinColumn(name = "id_ubicacion_tienda")
    private UbicacionTienda ubicacionTienda;
}
