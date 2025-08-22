import java.util.ArrayList;
import java.util.Iterator;

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

    public int removerSabor(String sabor){
        int totalCaixasRemovidas = 0;
        Iterator<PedidoCookie> iterador = cookie.iterator();
        while (iterador.hasNext()) {
            PedidoCookie item = iterador.next();
                if (item.getSabor() == sabor) {
                    totalCaixasRemovidas += item.getQuantidadeCaixas();
                    iterador.remove();
                }
        }    
        return totalCaixasRemovidas;
    }

}
