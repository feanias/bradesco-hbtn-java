import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<T> midias;

    public Biblioteca(){
        midias = new ArrayList<>();
    }
    
    public void adicionarMidia(T midia){
        midias.add(midia);
    }

    public List<T> obterListaMidias(){
        return midias;
    }

}
