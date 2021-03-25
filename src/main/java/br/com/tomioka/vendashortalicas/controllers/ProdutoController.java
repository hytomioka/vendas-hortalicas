package br.com.tomioka.vendashortalicas.controllers;

import br.com.tomioka.vendashortalicas.dto.ProdutoDto;
import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> find(@PathVariable Long id) {
        Optional<Produto> produto = service.find(id);
        if (produto.isPresent()) return ResponseEntity.ok().body(produto.get());
        else return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> produtos = service.findAll();
        return ResponseEntity.ok().body(produtos);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> create(@RequestBody ProdutoDto dao) {
        service.save(dao);
        return ResponseEntity.ok().build();
    }
}
