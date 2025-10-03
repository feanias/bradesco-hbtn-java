
public class SistemaFilas {

    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila(10);

        Produtor produtor1 = new Produtor(fila, 1);
        Produtor produtor2 = new Produtor(fila, 2);
        Consumidor consumidor1 = new Consumidor(fila, 1);
        Consumidor consumidor2 = new Consumidor(fila, 2);

        produtor1.start();
        produtor2.start();
        consumidor1.start();
        consumidor2.start();

        Thread.sleep(20000); // Deixa o sistema rodar por 20 segundos
        System.exit(0);
    }
}
