public class Program {


    public static void main(String[] args) {
    Pedido pedido = new Pedido();

    pedido.adicionarPedidoCookie(new PedidoCookie("Chocolate", 10));
    pedido.adicionarPedidoCookie(new PedidoCookie("Nutella", 3));
    pedido.adicionarPedidoCookie(new PedidoCookie("Baunilha", 2));

    pedido.obterTotalCaixas();

    }   
    
}   
