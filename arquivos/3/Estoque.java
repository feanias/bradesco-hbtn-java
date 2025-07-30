import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    
    public Estoque(String fileName) {
        // Lógica para carregar os produtos do arquivo CSV
        this.produtos = carregarProdutosDoArquivo(fileName);
    }


    private List<Produto> carregarProdutosDoArquivo(String fileName) {
        List<Produto> produtos = new ArrayList<>();
        // Lógica para ler o arquivo CSV e popular a lista de produtos
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    int id = Integer.parseInt(fields[0]);
                    String nome = fields[1];
                    int quantidade = Integer.parseInt(fields[2]);
                    double preco = Double.parseDouble(fields[3]);
                    produtos.add(new Produto(id, nome, quantidade, preco));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    private void salvarProdutosNoArquivo(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Produto produto : produtos) {
                writer.write(produto.getId() + "," + produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int id = produtos.get(produtos.size() - 1).getId() + 1; 
        if (produtos.isEmpty()) {
            id = 1; // Se não houver produtos, iniciar com ID 1
        }
        if(quantidade < 0 || preco < 0) {
            return;
        }
        Produto produto = new Produto(id, nome, quantidade, preco);
        produtos.add(produto);
        salvarProdutosNoArquivo("estoque.csv");

    }

    public void excluirProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);        
        salvarProdutosNoArquivo("estoque.csv");

    }

    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);            
                salvarProdutosNoArquivo("estoque.csv"); 
                return;
            }
        }

    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}