package com.entregas.sistemas.entregas.controller;

import com.entregas.sistemas.entregas.model.Pedido;
import com.entregas.sistemas.entregas.service.EntregaFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private EntregaFacade entregaFacade;

    public PedidoController(EntregaFacade entregaFacade) {
        this.entregaFacade = entregaFacade;
    }

    @PostMapping
    public Pedido criarPedido(@RequestParam String ProdutoNome, @RequestParam Long clienteId){
        return entregaFacade.criarPedido(ProdutoNome, clienteId);
    }

    @GetMapping
    public List<Pedido> listarPedidos(){
        return entregaFacade.listarPedidos();
    }
}
