package com.rockola.api.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@IdClass(ListaCancionId.class) /*Preguntar al profe si esto queda asi para la creacion de la llave primaria*/
@Table(name = "lista_cancion")
public class ListaCancion {

    /*Preguntar si asi esta correctamente creada la clave primaria ya que se compone de 2 foraneas*/
    @Id
    @Column(name = "lista_cancion_id_lista_fk")
    private Integer listaId;

    @Id
    @Column(name = "lista_cancion_id_cancion_fk")
    private Integer cancionesId;


    @ManyToOne
    @JoinColumn(name = "lista_cancion_id_lista_fk", referencedColumnName = "id_lista")
    private Lista lista;

    @ManyToOne
    @JoinColumn(name = "lista_cancion_id_cancion_fk", referencedColumnName = "id_cancion")
    private Canciones canciones;

    @Column(name = "descripcion_lista_cancion")
    private String descripcionListaCancion;


    /*Getter and Setter*/
    public Integer getListaId() {
        return listaId;
    }

    public void setListaId(Integer listaId) {
        this.listaId = listaId;
    }

    public Integer getCancionesId() {
        return cancionesId;
    }

    public void setCancionesId(Integer cancionesId) {
        this.cancionesId = cancionesId;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Canciones getCanciones() {
        return canciones;
    }

    public void setCanciones(Canciones canciones) {
        this.canciones = canciones;
    }

    public String getDescripcionListaCancion() {
        return descripcionListaCancion;
    }

    public void setDescripcionListaCancion(String descripcionListaCancion) {
        this.descripcionListaCancion = descripcionListaCancion;
    }
}
