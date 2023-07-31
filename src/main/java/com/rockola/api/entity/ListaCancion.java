package com.rockola.api.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "lista_cancion")
public class ListaCancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista_cancion")
    private Integer idListaCancion;
/* */
    @ManyToOne
    @JoinColumn(name = "lista_cancion_id_lista_fk", referencedColumnName = "id_lista")
    private Lista lista;

    @ManyToOne
    @JoinColumn(name = "lista_cancion_id_cancion_fk", referencedColumnName = "id_cancion")
    private Cancion cancion;

    @Column(name = "descripcion_lista_cancion")
    private String descripcionListaCancion;



}
