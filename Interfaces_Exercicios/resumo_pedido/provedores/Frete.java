package provedores;

public class Frete {
    
    private double valor;
    private TipoProvedorFrete tipoProvedorFrete;

    public Frete(double valorFrete, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valorFrete;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
    public double getValor() {
        return valor;
    }
    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoProvedorFrete(TipoProvedorFrete tipoProvedorFrete) {
        this.tipoProvedorFrete = tipoProvedorFrete;
    }
    

}
