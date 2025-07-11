public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano){
        int saudeMinima = 0;
        if(quantidadeDeDano >= this.getSaudeAtual()){
            this.setSaudeAtual(saudeMinima);
        }else{
            this.setSaudeAtual(this.saudeAtual -= quantidadeDeDano);
        }     
    }

    public void receberCura(int quantidadeDeCura){
        int saudeMaxima = 100;
        if((quantidadeDeCura + this.getSaudeAtual()) >= saudeMaxima){
            this.setSaudeAtual(saudeMaxima);
        }else{
            this.setSaudeAtual(this.saudeAtual += quantidadeDeCura);
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }
    public void setSaudeAtual(int saudeAtual) {
        if(saudeAtual <= 0){
            this.saudeAtual = 0;
            this.status = "morto";
        }else{
            this.saudeAtual = saudeAtual;
            this.status = "vivo";
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}