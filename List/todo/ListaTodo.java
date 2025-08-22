import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ListaTodo {

    static public ArrayList<Tarefa> tarefas;

    public ListaTodo(){
        tarefas = new ArrayList<>();
    }

    public boolean tarefaExiste(Tarefa tarefa){
        boolean existe = false;
        for (Tarefa t : tarefas) {
            if(tarefa.getIdentificador() == t.getIdentificador()){
                existe = true;
            }
        }
        return existe;
    }

    public void adicionarTarefa(Tarefa tarefa){
        try{
            if(tarefas.isEmpty()){
                tarefas.add(tarefa);
            }else{
                if(tarefaExiste(tarefa)){
                    throw new IllegalArgumentException("Tarefa com identificador "+ tarefa.getIdentificador() + " ja existente na lista");
                }else{
                    if(tarefa.getDescricao() == "" || tarefa.getDescricao().isBlank()){
                        throw new IllegalArgumentException("Descricao de tarefa invalida");
                    }else{
                        tarefas.add(tarefa);
                    }

                }
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
        
    public boolean marcarTarefaFeita(int indicadorTarefa){
        boolean feito = false;
        for (Tarefa t : tarefas) {
            if(indicadorTarefa  == t.getIdentificador()){
                feito = true;
                t.setEstahFeita(true);
            }
        }
        return feito;
    }

    public boolean desfazerTarefa(int indicadorTarefa){
        boolean feito = false;
        for (Tarefa t : tarefas) {
            if(indicadorTarefa == t.getIdentificador()){
                feito = true;
                t.setEstahFeita(false);
            }
        }
        return feito;
    }
    

    public void desfazerTodas(){
        for(Tarefa t : tarefas){
            t.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa t: tarefas){
            t.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        boolean status;
        String mensagem;
        for(Tarefa t: tarefas){
            status = t.isEstahFeita();
            if(status){
                mensagem = "[X] Id: "+ t.getIdentificador() + " Descricao: " + t.getDescricao() ;    
                System.out.println(mensagem);  
            }else{
                mensagem = "[ ] Id: "+ t.getIdentificador() + " Descricao: " + t.getDescricao() ;
                System.out.println(mensagem);
            }
        }
         
    }

}
