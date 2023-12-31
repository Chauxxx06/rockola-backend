package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario_lista")
public class UsuarioLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_lista")
    private Integer idUsuarioLista;

    @ManyToOne
    @JoinColumn(name="usuario_lista_id_lista_fk", referencedColumnName = "id_lista")
    private Lista lista;

    @ManyToOne
    @JoinColumn(name = "usuario_lista_id_asuario_fk", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @Column(name="descripcion_usuario_lista", length = 100)
    private String descripcionUsuarioLista;

}
