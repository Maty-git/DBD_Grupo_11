package com.DBD.Grupo_11.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdmin;
    private String idCorreoAdmin;
    private String nombreAdmin;
    private String ubicacionAdmin;
    private String contraseniaAdmin;

    private Long idPermiso;

}
