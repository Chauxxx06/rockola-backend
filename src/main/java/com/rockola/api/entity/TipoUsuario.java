package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;

    @Column(name = "nombre_tipo_usuario")
    private String nombreTipoUsuario;

    @Column(name = "descripcion_tipo_usuario")
    private String descripcionTipoUsuario;
}
