
public class Main {
    public static void main(String[] args) {
        GestaoAlunos gestaoAlunos = new GestaoAlunos();
        
        //adicionar 3 alunos

        gestaoAlunos.adicionarAluno(new Aluno("Felipe", 31));
        gestaoAlunos.adicionarAluno(new Aluno("Giovanna", 26));
        gestaoAlunos.adicionarAluno(new Aluno("Manuella", 1));
        
        //exibir lista de alunos
        gestaoAlunos.listarAlunos();

        //buscar um aluno
        gestaoAlunos.buscarAluno("Giovanna");

        //excluir um aluno
        gestaoAlunos.excluirAluno("Felipe");

        //tentar excluir um aluno inexistente e buscar outro aluno

        gestaoAlunos.excluirAluno("Bella");

        gestaoAlunos.buscarAluno("Manuella");


    }
}
