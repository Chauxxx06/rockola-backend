package com.rockola.api.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "lista")
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Integer idLista;

    @Column(name = "nombre_lista")
    private String nombreLista;

    @Column(name ="fecha_creo_lista")
    private LocalDateTime fechaCreoLista;

    @Column(name = "descripcion_lista")
    private String descripcionLista;


    /*Getter and Setter*/
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public LocalDateTime getFechaCreoLista() {
        return fechaCreoLista;
    }

    public void setFechaCreoLista(LocalDateTime fechaCreoLista) {
        this.fechaCreoLista = fechaCreoLista;
    }

    public String getDescripcionLista() {
        return descripcionLista;
    }

    public void setDescripcionLista(String descripcionLista) {
        this.descripcionLista = descripcionLista;
    }
}
