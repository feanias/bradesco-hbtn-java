public class Principal {
    public static void main(String[] args) {
        Contador contador = new Contador();
        ThreadContador thread1 = new ThreadContador(contador);
        ThreadContador thread2 = new ThreadContador(contador);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}