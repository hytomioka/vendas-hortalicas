package br.com.tomioka.vendashortalicas.services;

import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.repositories.ProdutoRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProdutoServiceTest {

    private ProdutoService service;
    private List<Produto> produtos;

    @Mock
    private ProdutoRepository produtoRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        this.service = new ProdutoService(produtoRepository);
        this.produtos = produtos();

    }

    @Test
    void deveriaListarTodosOsProdutosDoRepositorio() {
        when(produtoRepository.findAll()).thenReturn(produtos);
        List<Produto> produtosMock = service.findAll();

        assertEquals(produtos.get(0).getNome(), produtosMock.get(0).getNome());
        assertEquals(produtos.get(1).getNome(), produtosMock.get(1).getNome());
        assertEquals(produtos.get(2).getNome(), produtosMock.get(2).getNome());
    }

    @Test
    void deveriaEfetuarUmaBuscaPorId() {
        Long id = 1L;
        when(produtoRepository.findById(id))
                .thenReturn(Optional.ofNullable(produtos.get(0)));
        Optional<Produto> produtoMock = service.find(id);

        assertEquals(produtos.get(0).getId(), produtoMock.get().getId());
        assertEquals(produtos.get(0).getNome(), produtoMock.get().getNome());
    }

    private List<Produto> produtos() {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto(1L, "Alface Americana", new BigDecimal("2")));
        lista.add(new Produto(2L, "Couve Manteiga", new BigDecimal("1.5")));
        lista.add(new Produto(3L, "Brocolis", new BigDecimal("4")));
        return lista;
    }
}