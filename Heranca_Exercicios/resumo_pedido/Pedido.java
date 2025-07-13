public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public void calcularTotalDesconto() {
        double totalDesconto = 0.0;
        for (ItemPedido item : itens) {
            totalDesconto += item.calcularTotal() * (percentualDesconto / 100);
        }
        this.percentualDesconto = totalDesconto;
    }
    
    public double calcularTotalBruto() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * (item.getProduto().getPrecoBruto());
        }
        return total;
    }

     public double calcularTotalComDesconto() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().obterPrecoLiquido() 
                    * (1 - (percentualDesconto / 100));
        }
        return total;
    }

    public void apresentarResumoPedido() {
        double valorDesconto = 0.0;
        double total = 0.0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s Titulo: %s Preco: %.2f Quant: %d Total: %.2f \n",
                    item.getProduto().getClass().getSimpleName(),
                    item.getProduto().getTitulo(),
                    item.getProduto().getPrecoBruto(),
                    item.getQuantidade(),
                    item.calcularTotal()
                    );
            total+= item.calcularTotal();

            valorDesconto += item.calcularTotalDesconto(percentualDesconto);
        }   
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", valorDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", total);
        System.out.println("----------------------------");
        System.out.printf(  "TOTAL PEDIDO: %.2f\n", calcularTotalComDesconto());
        System.out.println("----------------------------");
    }
        
}
