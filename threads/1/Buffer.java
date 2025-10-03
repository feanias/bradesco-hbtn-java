public class Buffer {
    private int item = -1; // -1 indica que o buffer está vazio


    // Método para o produtor colocar um item no buffer
    public synchronized void produzir(int item) throws InterruptedException {
        // Se o buffer já tem um item, espera o consumidor consumi-lo
        while (this.item != -1) {
            wait(); // Espera o consumidor consumir o item
        }


        // Coloca o item no buffer
        this.item = item;
        System.out.println("Produtor produziu: " + item);

        // Notifica o consumidor que o item foi produzido
        notify();
    }


    // Método para o consumidor retirar um item do buffer
    public synchronized int consumir() throws InterruptedException {
        // Se o buffer estiver vazio, espera o produtor produzir um item
        while (this.item == -1) {
            wait(); // Espera o produtor produzir um item
        }


        // Retira o item do buffer
        int consumido = this.item;
        this.item = -1; // Indica que o buffer está vazio
        System.out.println("Consumidor consumiu: " + consumido);


        // Notifica o produtor que o buffer está vazio
        notify();


        return consumido;
    }
}