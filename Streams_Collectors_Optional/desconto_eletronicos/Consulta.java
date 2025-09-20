import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        return pedido.getProdutos().stream()
                .filter(produto -> produto.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos){
        return produtos.stream()
            .sorted(Comparator.comparing(Produto::getPreco).reversed())
            .findFirst().orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo){
        return produtos.stream()
        .filter(produto -> produto.getPreco() >= precoMinimo)
        .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos){
        return pedidos.stream()
        .filter(pedido -> pedido.getProdutos().stream()
        .anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
        .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos){
         return produtos.stream()
                .map(produto -> {
                    if (produto.getCategoria() == CategoriaProduto.ELETRONICO) {
                        double precoComDesconto = produto.getPreco() * 0.85;
                        return new Produto(produto.getCodigo(), produto.getNome(), produto.getCategoria(), precoComDesconto);
                    }
                    return produto;
                })
                .collect(Collectors.toList());
    }
}
