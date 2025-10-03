
public class Consumidor extends Thread {
    private Fila fila;
    private int id;

    public Consumidor(Fila fila, int id) {
        this.fila = fila;
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            try {
                int valor = fila.remover();
                System.out.println("Consumidor " + id + " consumiu: " + valor);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }    
        }
    }

}
