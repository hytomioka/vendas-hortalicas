package br.com.tomioka.vendashortalicas.services;

import br.com.tomioka.vendashortalicas.dto.ProdutoDto;
import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> find(Long id) {
        return produtoRepository.findById(id);
    }

    public void save(ProdutoDto dao) {
        Produto produto = dao.converte();
        produtoRepository.save(produto);
    }
}
