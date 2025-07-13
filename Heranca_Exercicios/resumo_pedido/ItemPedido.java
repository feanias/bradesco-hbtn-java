import produtos.Produto;

public class ItemPedido {

    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public double obterPrecoLiquido() {
        return produto.obterPrecoLiquido();
    }
    
}
