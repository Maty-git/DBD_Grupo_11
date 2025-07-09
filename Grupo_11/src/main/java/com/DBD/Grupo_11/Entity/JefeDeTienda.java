package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jefe_de_tienda")
public class JefeDeTienda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJefeDeTienda;
    private String correoJefe;
    private String nombreJefe;
    private String contraseniaJefe;
    @OneToOne
    @JoinColumn(name = "id_permisos")
    private Permisos permisos;
}
