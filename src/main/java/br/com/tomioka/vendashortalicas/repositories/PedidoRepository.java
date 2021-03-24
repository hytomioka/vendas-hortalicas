package br.com.tomioka.vendashortalicas.repositories;

import br.com.tomioka.vendashortalicas.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
