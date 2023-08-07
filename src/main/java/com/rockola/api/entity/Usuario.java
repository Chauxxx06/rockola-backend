package com.rockola.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;

    @Column(name = "nombre_usuario", length = 50)
    private String nombreUsuario;

    @Column(name = "email_usuario", length = 100)
    private String emailUsuario;

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "nro_celular")
    private Integer nroCelular;

    @Column(name = "Password", length = 50)
    private String password;

    @Column(name = "fecha_registro", columnDefinition = "DATETIME")
    private LocalDateTime fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id-tipo-usuario-fk", referencedColumnName = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;

}
