public interface ProvedorFrete {
    
    public Frete calcularFrete(double peso, double valor);

    public TipoProvedorFrete obterTipoProvedorFrete(TipoProvedorFrete frete);
}
