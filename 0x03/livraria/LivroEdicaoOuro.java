import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + (super.getPreco() * 0.30));
    }
}
