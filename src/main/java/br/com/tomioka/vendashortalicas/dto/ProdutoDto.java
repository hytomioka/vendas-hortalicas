package br.com.tomioka.vendashortalicas.dto;

import br.com.tomioka.vendashortalicas.models.Produto;

import java.math.BigDecimal;

public class ProdutoDto {

    private String nome;
    private BigDecimal preco;

    public ProdutoDto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

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
