package com.rockola.api.entity;

import jakarta.persistence.*;
import lombok.Data;

//import java.io.File;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name= "genero_musical")
public class GeneroMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private Integer idGenero;

    @Column(name = "tipo_genero")
    private String tipoGenero;

    @Column(name = "descripcion_genero")
    private String descripcionGenero;

    @Column(name="imagen_genero_musical")
    private String imagenGenero;

    @Column(name ="fecha_registro")
    private LocalDateTime fechaCreoGenero;
}
