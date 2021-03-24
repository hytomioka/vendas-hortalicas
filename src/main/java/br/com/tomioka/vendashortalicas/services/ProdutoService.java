package br.com.tomioka.vendashortalicas.services;

import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }
}
