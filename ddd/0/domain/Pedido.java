package domain;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import domain.Cliente;
import domain.Produto;
import domain.StatusPedido;


public class Pedido {


    private final String id;
    private Cliente cliente;
    private List<Produto> produtos;
    private StatusPedido status;


    public Pedido(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }


    public void adicionarProduto(Produto produto) {
        //implementar
    }


    public void removerProduto(Produto produto) {
        //implementar
    }


    public void pagar() {
        pedido.StatusPedido = StatusPedido.PAGO;
    }


    public void cancelar() {
        pedido.StatusPedido = StatusPedido.CANCELADO;
    }


    public String getId() {
        return id;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }


    public StatusPedido getStatus() {
        return status;
    }
}