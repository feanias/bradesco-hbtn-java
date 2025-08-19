public interface Armazenavel<T> {

    void adicionarAoInventario(String nome, T valor);
    
    T obterDoInventario(String nome);

}
