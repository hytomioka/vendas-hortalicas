package br.com.tomioka.vendashortalicas.controllers;

import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> produtos = service.findAll();
        return ResponseEntity.ok().body(produtos);
    }
}
