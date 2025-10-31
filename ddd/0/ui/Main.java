package ui;


import java.math.BigDecimal;


import application.PedidoService;
import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import infrastructure.PedidoRepository;


public class Main {


    public static void main(String[] args) {
        PedidoRepository pedidoRepository = new PedidoRepository();
        PedidoService pedidoService = new PedidoService(pedidoRepository);


        Cliente cliente = new Cliente("1", "João Silva");
        Produto produto1 = new Produto("Notebook", new BigDecimal("3000.00"));
        Produto produto2 = new Produto("Mouse", new BigDecimal("150.00"));


        Pedido pedido = pedidoService.criarPedido(cliente);


        pedidoService.adicionarProduto(pedido.getId(), produto1);
        pedidoService.adicionarProduto(pedido.getId(), produto2);


        System.out.println("Pedido criado com ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Produtos no pedido:");
        pedido.getProdutos().forEach(prod -> System.out.println(" - " + prod.getNome()));


        pedidoService.pagarPedido(pedido.getId());
        System.out.println("Status do pedido após pagamento: " + pedido.getStatus());
    }
}