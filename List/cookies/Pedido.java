import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    static private ArrayList<PedidoCookie> cookies;
    
    public Pedido(){
        cookies = new ArrayList<>();
    }
    
    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCaixasPedidas = 0;
        for (PedidoCookie pedidoCookie : cookies) {
            totalCaixasPedidas+= pedidoCookie.getQuantidadeCaixas();            
        }
        return totalCaixasPedidas;
    }

    public int removerSabor(String sabor){
        int totalCaixasRemovidas = 0;
        Iterator<PedidoCookie> iterador = cookies.iterator();
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
