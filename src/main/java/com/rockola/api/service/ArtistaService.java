package com.rockola.api.service;

import java.util.List;

import com.rockola.api.entity.Artista;
import com.rockola.api.entity.dto.ArtistaDTO;

public interface ArtistaService extends CRUD<Artista, String>{
     public List<ArtistaDTO> getIdYTNombreArtista();
}
