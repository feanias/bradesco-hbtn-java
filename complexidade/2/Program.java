public class Program {

    public static void main(String[] args) {
        long inicio  = System.nanoTime();
        try {
            PessoasArray p = new PessoasArray();
            p.buscaBinaria("Otavio");
            p.buscaBinaria("Isabela");
            p.buscaBinaria("Anderson");
        }finally {
            System.out.println("Tempo de execução: "+(System.nanoTime()-inicio));
        }
    }
}