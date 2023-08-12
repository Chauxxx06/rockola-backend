package com.rockola.api.controller;

import com.rockola.api.entity.CancionArtista;
import com.rockola.api.entity.Lista;
import com.rockola.api.service.CancionArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cancion-artista")
public class CancionArtistaController {

    @Autowired
    private CancionArtistaService service;

    @PostMapping("/save")
    public ResponseEntity<CancionArtista> register(@RequestBody CancionArtista cancionArtista)
    {
        return new ResponseEntity<CancionArtista>(service.register(cancionArtista), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<CancionArtista>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<CancionArtista> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<CancionArtista> update(@RequestBody CancionArtista cancionArtista){
        return new ResponseEntity<CancionArtista>(service.register(cancionArtista),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
