import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    public Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup / 100);
    
    public Consumer<Double> atualizarMarkup = novoPreco -> this.percentualMarkup = novoPreco;
    
    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }   

}
