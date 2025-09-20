public class Cliente {
    private int codigo;
    private String nome;
    private boolean premium;

    public Cliente(int codigo, String nome, Boolean premium){
        this.codigo = codigo;
        this.nome = nome;
        this.premium = premium;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
