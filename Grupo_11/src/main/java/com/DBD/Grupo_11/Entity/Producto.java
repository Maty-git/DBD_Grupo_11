package com.DBD.Grupo_11.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "producto" )
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;
}
