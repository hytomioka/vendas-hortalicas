package br.com.tomioka.vendashortalicas.repositories;

import br.com.tomioka.vendashortalicas.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
