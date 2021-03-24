package br.com.tomioka.vendashortalicas.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<Produto> produtos;
    private BigDecimal totalPedido;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Long id, List<Produto> produtos, BigDecimal totalPedido, Cliente cliente) {
        this.id = id;
        this.produtos = produtos;
        this.totalPedido = totalPedido;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
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
