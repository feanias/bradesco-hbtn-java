import java.util.ArrayList;

public class Pedido {
    static private ArrayList<PedidoCookie> cookie;
    
    public Pedido(){
        cookie = new ArrayList<>();
    }
    
    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookie.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCaixasPedidas = 0;
        for (PedidoCookie pedidoCookie : cookie) {
            totalCaixasPedidas+= pedidoCookie.getQuantidadeCaixas();            
        }
        return totalCaixasPedidas;
    }

}
