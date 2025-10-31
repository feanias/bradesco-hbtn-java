public class Pedido {
    private int id;
    private String nomeProduto;
    private double valor;
    private boolean pago;


    public Pedido(int id, String nomeProduto, double valor) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.pago = false;
    }


    public int getId() {
        return id;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }


    public double getValor() {
        return valor;
    }


    public boolean isPago() {
        return pago;
    }


    public void setPago(boolean pago) {
        this.pago = pago;
    }
}