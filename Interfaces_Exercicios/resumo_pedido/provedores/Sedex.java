public class Sedex implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0.0;
        if(peso > 1000){
            valorFrete = (valor * 0.10);
        }else{
           valorFrete = (valor * 0.05);
        }
        return new Frete(valorFrete, TipoProvedorFrete.SEDEX);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete(TipoProvedorFrete frete) {
        return TipoProvedorFrete.SEDEX;
    }
}
