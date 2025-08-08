package com.entregas.sistemas.entregas.repository;

import com.entregas.sistemas.entregas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
