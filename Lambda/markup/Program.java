public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto(129.99, "Mouse Gamer");

        System.out.printf("%s - %.2f - %.2f\n", produto1.getNome(),
            produto1.getPreco(),
            produto1.precoComMarkup.get());

        produto1.atualizarMarkup.accept(15d);

        System.out.printf("%s - %.2f - %.2f\n", produto1.getNome(),
            produto1.getPreco(),
            produto1.precoComMarkup.get());
    }
}