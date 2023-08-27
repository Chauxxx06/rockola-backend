package com.rockola.api.entity;

// import java.sql.Date;
// import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "artista")
public class Artista {
    
    @Id
    @Column(name = "id_artista")
    private String idArtista;

    @Column(name = "nombre_artista", length = 50)
    private String nombreArtista;

    @Column(name = "genero_artista", length = 100)
    private String generoArtista;

    @Column(name = "descripcion_artista", length = 100)
    private String descripcionArtista;

    @Column(name = "fecha_registro", columnDefinition = "DATETIME")
    private String fechaRegistro;

}
