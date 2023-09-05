package com.rockola.api.service.impl;

import com.rockola.api.entity.GeneroMusical;
import com.rockola.api.entity.dto.GeneroMusicalDTO;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.GeneroMusicalRepository;
import com.rockola.api.service.GeneroMusicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroMusicalServiceImpl extends CRUDImpl<GeneroMusical, Integer> implements GeneroMusicalService {

    @Autowired
    private GeneroMusicalRepository repository;
    @Override
    protected GenericRepository<GeneroMusical, Integer> getRepository() {
        return repository;
    }
    @Override
    public List<GeneroMusicalDTO> getIdYTipoGenero() {
        List<GeneroMusical> generos = repository.findAll();

        // Mapear GeneroMusical a GeneroMusicalDTO si es necesario
        List<GeneroMusicalDTO> dtos = generos.stream()
                .map(genero -> {
                    GeneroMusicalDTO dto = new GeneroMusicalDTO();
                    dto.setIdGenero(genero.getIdGenero());
                    dto.setTipoGenero(genero.getTipoGenero());
                    return dto;
                })
                .collect(Collectors.toList());

        return dtos;
    }
}
