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

}
