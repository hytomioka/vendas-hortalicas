package br.com.tomioka.vendashortalicas.services;

import br.com.tomioka.vendashortalicas.models.Pedido;
import br.com.tomioka.vendashortalicas.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }
}
