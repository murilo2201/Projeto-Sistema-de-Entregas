package com.entregas.sistemas.entregas.model;

import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private String status;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Entregador entregador;

    public Pedido(){}

    public Pedido(String nomeProduto, String status, Cliente cliente, Entregador entregador) {
        this.nomeProduto = nomeProduto;
        this.status = status;
        this.cliente = cliente;
        this.entregador = entregador;
    }

    public Long getId() {
        return id;
    }

    public String getProdutoNome() {
        return nomeProduto;
    }

    public void setProdutoNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
}
