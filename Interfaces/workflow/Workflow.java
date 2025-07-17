
import atividades.Atividade;
import java.util.ArrayList;

public class Workflow {
    
    private ArrayList<Atividade> atividades = new ArrayList<>();
    
    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    
}
