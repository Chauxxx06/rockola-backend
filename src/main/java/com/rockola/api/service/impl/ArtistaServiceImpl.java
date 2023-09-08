package com.rockola.api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockola.api.entity.Artista;
import com.rockola.api.entity.dto.ArtistaDTO;
import com.rockola.api.repository.ArtistaRepository;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.service.ArtistaService;

@Service
public class ArtistaServiceImpl extends CRUDImpl<Artista, String> implements ArtistaService{
    @Autowired
    private ArtistaRepository repository;

    @Override
    protected GenericRepository<Artista, String> getRepository() { return repository; }

    @Override
    public List<ArtistaDTO> getIdYTNombreArtista(){
        List<Artista> artistas = repository.findAll();

        List<ArtistaDTO> dtos = artistas.stream()
        .map(artista -> {
                    ArtistaDTO dto = new ArtistaDTO();
                    dto.setIdArtista(artista.getIdArtista());
                    dto.setNombreArtista(artista.getNombreArtista());
                    return dto;
                })
                .collect(Collectors.toList());
        return dtos;        
        }
}
