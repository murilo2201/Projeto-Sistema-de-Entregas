package com.entregas.sistemas.entregas.controller;

import com.entregas.sistemas.entregas.model.Cliente;
import com.entregas.sistemas.entregas.service.EntregaFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final EntregaFacade entregaFacade;

    public ClienteController(EntregaFacade entregaFacade) {
        this.entregaFacade = entregaFacade;
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){
        return entregaFacade.salvarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return entregaFacade.listarCliente();
    }
}
