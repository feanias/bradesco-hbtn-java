import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;
    double valorTaxaDepositoSaque = 0.10; 

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0; // Inicializa a quantidade de transações como zero
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor - valorTaxaDepositoSaque);
        quantidadeTransacoes++;
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor + valorTaxaDepositoSaque); // Aplica a taxa de R$0,10 ao saque
        quantidadeTransacoes++;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
    
    


}
