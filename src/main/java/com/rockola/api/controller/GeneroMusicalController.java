package com.rockola.api.controller;

import com.rockola.api.entity.GeneroMusical;
import com.rockola.api.entity.dto.GeneroMusicalDTO;
import com.rockola.api.service.GeneroMusicalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genero-musical")
public class GeneroMusicalController {

    @Autowired
    private GeneroMusicalService service;
    
    @PostMapping("/save")
    public ResponseEntity<GeneroMusical>register(@RequestBody GeneroMusical generoMusical){
        return new ResponseEntity<GeneroMusical>(service.register(generoMusical), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<GeneroMusical>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/lst_name")
    public ResponseEntity<List<GeneroMusicalDTO>> list_category(){
        return ResponseEntity.ok(service.getIdYTipoGenero());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<GeneroMusical> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<GeneroMusical> update(@RequestBody GeneroMusical generoMusical){
        if (service.getById(generoMusical.getIdGenero())!= null) {
            return new ResponseEntity<GeneroMusical>(service.register(generoMusical),HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
