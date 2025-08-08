package com.entregas.sistemas.entregas.service.strategy;

import com.entregas.sistemas.entregas.model.Entregador;

import java.util.List;

public interface EscolhaEntregador {

    Entregador selecionarEntregador(List<Entregador> entregadores);
}
