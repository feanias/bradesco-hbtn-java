public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador){
        this.descricao = descricao;
        this.identificador = identificador;
        this.estahFeita = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void modificarDescricao(String descricao){
        try {
            if(!descricao.isBlank() && !descricao.isEmpty()){
                    this.descricao = descricao;
            }else{
                throw new Exception("Descricao de tarefa invalida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
