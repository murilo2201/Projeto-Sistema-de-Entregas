package com.entregas.sistemas.entregas.service;

import com.entregas.sistemas.entregas.model.Cliente;
import com.entregas.sistemas.entregas.model.Entregador;
import com.entregas.sistemas.entregas.model.Pedido;
import com.entregas.sistemas.entregas.repository.ClienteRepository;
import com.entregas.sistemas.entregas.repository.EntregadorRepository;
import com.entregas.sistemas.entregas.repository.PedidoRepository;
import com.entregas.sistemas.entregas.service.strategy.EscolhaEntregador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaFacade {

    private final ClienteRepository clienteRep;
    private final EntregadorRepository entregadorRep;
    private final PedidoRepository pedidoRep;
    private final EscolhaEntregador estrategiaEntregador;

    public EntregaFacade(ClienteRepository clienteRep, EntregadorRepository entregadorRep,
                         PedidoRepository pedidoRep, EscolhaEntregador estrategiaEntregador) {
        this.clienteRep = clienteRep;
        this.entregadorRep = entregadorRep;
        this.pedidoRep = pedidoRep;
        this.estrategiaEntregador = estrategiaEntregador;
    }

    public Cliente salvarCliente(Cliente cliente){
        return clienteRep.save(cliente);
    }

    public List<Cliente> listarCliente(){
        return clienteRep.findAll();
    }

    public Entregador salvarEntregador(Entregador entregador){
        return entregadorRep.save(entregador);
    }

    public List<Entregador> listarEntregador(){
        return entregadorRep.findAll();
    }

    public Pedido criarPedido(String ProdutoNome, Long clienteId){
        Cliente cliente = clienteRep.findById(clienteId).orElseThrow();
        List<Entregador> entregadores = entregadorRep.findAll();

        Entregador entregador = estrategiaEntregador.selecionarEntregador(entregadores);

        Pedido pedido = new Pedido();
        pedido.setProdutoNome(ProdutoNome);
        pedido.setStatus("Pendente");
        pedido.setCliente(cliente);
        pedido.setEntregador(entregador);

        return pedidoRep.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRep.findAll();
    }
}
