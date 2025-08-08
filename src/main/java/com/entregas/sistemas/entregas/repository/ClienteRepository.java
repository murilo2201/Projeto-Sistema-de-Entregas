package com.entregas.sistemas.entregas.repository;

import com.entregas.sistemas.entregas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
