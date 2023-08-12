package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cancion_artista")
public class CancionArtista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cancion_artista")
    private Integer idCancionArtista;

    @Column(name = "descripcion_cancion_artista", length = 100)
    private  String descripcionCancionArtista;

    @ManyToOne
    @JoinColumn(name="cancion_artista_id_cancion_fk", referencedColumnName = "id_cancion")
    private Cancion cancion;

    @ManyToOne
    @JoinColumn(name = "cancion_artista_id_artista_fk", referencedColumnName = "id_artista")
    private Artista artista;


}
