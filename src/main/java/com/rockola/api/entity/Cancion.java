package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

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

    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name="imagen_cancion")
    private String imagenCancion;

    @Column(name ="fecha_registro")
    private LocalDateTime fechaCreoCancion;

     @ManyToOne
    @JoinColumn(name="id_genero", referencedColumnName = "id_genero", insertable=false, updatable=false)
    private GeneroMusical generoMusical;
    

}
