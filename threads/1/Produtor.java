public class Produtor extends Thread {
    private Buffer buffer;


    public Produtor(Buffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produzir(i);  // O produtor coloca os itens no buffer
                Thread.sleep(1000);   // Simula o tempo para produzir um item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}