package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.File;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="cancion")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cancion")
    private Integer idCancion;

    @Column(name = "nombre_cancion")
    private String nombreCancion;

    @Column(name = "descripcion_cancion")
    private String descripcionCancion;

    @Column(name = "url_cancion")
    private String urlCancion;

    @Column(name="imagen_cancion")
    private File imagenCancion;

    @Column(name ="fecha_registro_cancion")
    private LocalDateTime fechaCreoCancion;

    @ManyToOne
    @JoinColumn(name="cancion_id_genero_music_fk", referencedColumnName = "id_genero")
    private GeneroMusical generoMusical;


}
