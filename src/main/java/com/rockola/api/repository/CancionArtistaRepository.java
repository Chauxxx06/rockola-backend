package com.rockola.api.repository;

import com.rockola.api.entity.CancionArtista;
import org.springframework.stereotype.Repository;


@Repository
public interface CancionArtistaRepository extends GenericRepository<CancionArtista, Integer> {
}
