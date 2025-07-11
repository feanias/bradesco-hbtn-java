public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public void tomarDano(int quantidadeDeDano){
        int saudeMinima = 0;
        if(quantidadeDeDano >= saudeMinima){
            this.saudeAtual = 0;
        }else{
            this.saudeAtual -= quantidadeDeDano;
        }     
    }

    public void receberCura(int quantidadeDeCura){
        int saudeMaxima = 100;
        if((quantidadeDeCura + this.saudeAtual) >= saudeMaxima){
            this.saudeAtual = saudeMaxima;
        }else{
            this.saudeAtual += quantidadeDeCura;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}