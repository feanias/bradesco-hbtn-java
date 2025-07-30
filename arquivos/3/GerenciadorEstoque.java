import java.io.IOException;
import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque("estoque.csv");


        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Excluir Produto");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Atualizar Quantidade de Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    estoque.adicionarProduto(nome, quantidade, preco);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                    
                case 2:
                    System.out.print("Digite o ID do produto a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    estoque.excluirProduto(idExcluir);
                    break;
                case 3:
                    System.out.println("Estoques:");
                    estoque.exibirEstoque();
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                     
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}