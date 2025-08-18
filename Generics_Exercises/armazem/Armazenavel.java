public interface Armazenavel<T> {

    void adicionarAoInventario(String nome, T valor);
    
    T obterDoIntervalo(String nome);

}
