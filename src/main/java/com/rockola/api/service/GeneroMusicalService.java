package com.rockola.api.service;

import com.rockola.api.entity.GeneroMusical;
import com.rockola.api.entity.dto.GeneroMusicalDTO;

import java.util.List;

public interface GeneroMusicalService extends CRUD<GeneroMusical, Integer>{

    public List<GeneroMusicalDTO> getIdYTipoGenero();
}
