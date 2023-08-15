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

import com.rockola.api.entity.Usuario;
import com.rockola.api.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioServiceImpl usuarioService;

    @PostMapping("/save")
    public ResponseEntity<Usuario> register(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(this.usuarioService.register(usuario));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(this.usuarioService.getAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(this.usuarioService.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(this.usuarioService.register(usuario));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        this.usuarioService.delete(id);
        return ResponseEntity.notFound().build();
    }
}
