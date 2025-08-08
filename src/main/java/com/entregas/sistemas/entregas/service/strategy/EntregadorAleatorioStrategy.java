package com.entregas.sistemas.entregas.service.strategy;

import com.entregas.sistemas.entregas.model.Entregador;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class EntregadorAleatorioStrategy implements EscolhaEntregador{

    private final Random random = new Random();

    @Override
    public Entregador selecionarEntregador(List<Entregador> entregadores){
        if(entregadores == null || entregadores.isEmpty() ){
            return null;
        }
        int index = random.nextInt(entregadores.size());
        return entregadores.get(index);
    }
}
