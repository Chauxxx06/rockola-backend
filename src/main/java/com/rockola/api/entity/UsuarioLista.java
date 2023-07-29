package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@IdClass(UsuarioListaId.class)
@Table(name = "usuario_lista")
public class UsuarioLista {

    @Id
    @Column(name="usuario_lista_id_lista_fk")
    private Integer listaId;

    @Id
    @Column(name="usuario_lista_id_asuario_fk")
    private String usuarioId;


    @ManyToOne
    @JoinColumn(name="usuario_lista_id_lista_fk", referencedColumnName = "id_lista")
    private Lista lista;

    @ManyToOne
    @JoinColumn(name = "usuario_lista_id_asuario_fk", referencedColumnName = "id_asuario")
    private Usuario usuario;

    @Column(name="descripcion_usuario_lista")
    private String descripcionUsuarioLista;


    /*Getter and Setter*/
    public Integer getListaId() {
        return listaId;
    }

    public void setListaId(Integer listaId) {
        this.listaId = listaId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcionUsuarioLista() {
        return descripcionUsuarioLista;
    }

    public void setDescripcionUsuarioLista(String descripcionUsuarioLista) {
        this.descripcionUsuarioLista = descripcionUsuarioLista;
    }
}
