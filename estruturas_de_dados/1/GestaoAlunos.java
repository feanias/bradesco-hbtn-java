import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

public class GestaoAlunos {

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void excluirAluno(String nomeAluno){
        Aluno aluno = buscarAluno(nomeAluno);
        if(aluno != null){
            listaAlunos.remove(aluno);
        }
        
    }

    public Aluno buscarAluno(String nomeAluno){
        for(Aluno aluno:listaAlunos){
            if(aluno.getNome().equals(nomeAluno)){
                System.out.println("Aluno: " + aluno);
            }
        }
        System.out.println("Não encontrado");
        return null;
    }

    public void listarAlunos(){
        if(listaAlunos.isEmpty()){
            System.out.println("Não existem alunos cadastrados.");
        }else{
            System.out.println("Alunos:");
            for (Aluno aluno : listaAlunos) {
                System.out.println(aluno);
            }
        }

    }

}
