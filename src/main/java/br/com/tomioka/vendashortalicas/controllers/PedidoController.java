package br.com.tomioka.vendashortalicas.controllers;

import br.com.tomioka.vendashortalicas.models.Pedido;
import br.com.tomioka.vendashortalicas.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        List<Pedido> pedidos = service.findAll();
        return ResponseEntity.ok().body(pedidos);
    }
}
