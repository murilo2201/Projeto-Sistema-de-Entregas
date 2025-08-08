package com.entregas.sistemas.entregas.controller;

import com.entregas.sistemas.entregas.model.Entregador;
import com.entregas.sistemas.entregas.service.EntregaFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {

    private EntregaFacade entregaFacade;

    public EntregadorController(EntregaFacade entregaFacade) {
        this.entregaFacade = entregaFacade;
    }

    @PostMapping
    public Entregador criarEntregador(@RequestBody Entregador entregador){
        return entregaFacade.salvarEntregador(entregador);
    }

    @GetMapping
    public List<Entregador> listarEntregadores(){
        return entregaFacade.listarEntregador();
    }
}
