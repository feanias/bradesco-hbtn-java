
import java.util.LinkedList;

public class Fila {

    private static int CAPACIDADE_MAXIMA;
    private LinkedList<Integer> fila;

    public Fila(int capacidade) {
        CAPACIDADE_MAXIMA = capacidade;
        fila = new LinkedList<>();
    }

    public synchronized void adicionar(int valor) {
        if(fila.size() == CAPACIDADE_MAXIMA) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        fila.add(valor);
        notifyAll();
    }

    public synchronized int remover() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }
        int r =  fila.removeFirst();
        notifyAll();
        return r;   
    }
}
