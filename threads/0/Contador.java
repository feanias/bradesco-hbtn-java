public class Contador {
    private int count = 0;


    // Método sincronizado para garantir que o contador seja atualizado de maneira segura
    public synchronized void incrementar() {
        count++;
    }


    public int getContagem() {
        return count;
    }
}
