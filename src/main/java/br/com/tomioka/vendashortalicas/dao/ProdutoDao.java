package br.com.tomioka.vendashortalicas.dao;

import br.com.tomioka.vendashortalicas.models.Produto;
import br.com.tomioka.vendashortalicas.repositories.ProdutoRepository;

import java.math.BigDecimal;

public class ProdutoDao {

    private String nome;
    private BigDecimal preco;

    public Produto converte() {
        return new Produto(nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
