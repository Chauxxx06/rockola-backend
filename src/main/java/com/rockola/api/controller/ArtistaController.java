package com.rockola.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockola.api.entity.Artista;
import com.rockola.api.entity.dto.ArtistaDTO;
import com.rockola.api.service.impl.ArtistaServiceImpl;

@RestController
@RequestMapping("artista")
public class ArtistaController {
    @Autowired
    private ArtistaServiceImpl artistaServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Artista> register(@RequestBody Artista artista) {
        return ResponseEntity.ok(this.artistaServiceImpl.register(artista));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Artista>> getAll() {
        return ResponseEntity.ok(this.artistaServiceImpl.getAll());
    }

     @GetMapping("/lst_name")
    public ResponseEntity<List<ArtistaDTO>> list_artista(){
        return ResponseEntity.ok(artistaServiceImpl.getIdYTNombreArtista());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Artista> getById(@PathVariable String id) {
        return ResponseEntity.ok(this.artistaServiceImpl.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Artista> update(@RequestBody Artista artista) {
        return ResponseEntity.ok(this.artistaServiceImpl.register(artista));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        System.out.println(id);
        this.artistaServiceImpl.delete(id);
        return ResponseEntity.notFound().build();
    }
}
