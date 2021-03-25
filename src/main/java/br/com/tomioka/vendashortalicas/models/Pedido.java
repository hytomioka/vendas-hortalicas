package br.com.tomioka.vendashortalicas.models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @JsonIgnore
    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> produtosPedidos = new HashSet<>();

    private BigDecimal totalPedido;

    public Pedido() {
    }

    public Pedido(Long id, Set<ItemPedido> produtos, BigDecimal totalPedido, Cliente cliente) {
        this.id = id;
        this.produtosPedidos = produtos;
        this.totalPedido = totalPedido;
        this.cliente = cliente;
    }

    @Transient
    public BigDecimal getPrecoTotalDoPedido() {
        BigDecimal total = new BigDecimal("0");
        Set<ItemPedido> produtosPedidos = getProdutosPedidos();
        for (ItemPedido itemPedido : produtosPedidos) {
            total = total.add(itemPedido.getSubTotal());
        }
        return total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ItemPedido> getProdutosPedidos() {
        return produtosPedidos;
    }

    public void setProdutosPedidos(Set<ItemPedido> produtos) {
        this.produtosPedidos = produtos;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
