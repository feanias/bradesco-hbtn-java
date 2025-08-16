public class Midia {

    private String nome;

    public Midia(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    } 
    

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
    }
}
