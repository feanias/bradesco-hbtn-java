package livraria.exceptions;

@SuppressWarnings("serial")
public class LivroInvalidoException extends Exception {
    public LivroInvalidoException(String msg) {
        super(msg);
    }
}
