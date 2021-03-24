package br.com.tomioka.vendashortalicas.repositories;

import br.com.tomioka.vendashortalicas.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
