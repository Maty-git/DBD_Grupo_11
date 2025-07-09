package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTienda;
    private String nombreTienda;
    private String ubicacionTienda;
    @OneToOne
    @JoinColumn(name = "id_jefe_tienda")
    private JefeDeTienda jefeDeTienda;
}
