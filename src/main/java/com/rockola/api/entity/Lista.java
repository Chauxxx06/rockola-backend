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

    @Column(name = "nombre_lista", length = 70)
    private String nombreLista;

    @Column(name ="fecha_creo_lista", columnDefinition = "DATETIME")
    private LocalDateTime fechaCreoLista;

    @Column(name = "descripcion_lista", length = 100)
    private String descripcionLista;

}
