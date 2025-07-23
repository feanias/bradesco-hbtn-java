import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo = 0;
    private double valorPenalidade = 0;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        double valorTarifa = super.calcularTarifaMensal();
        double jurosMensal = super.calcularJurosMensal();
        if (getSaldo() <= saldoMinimo) {
            valorTarifa += valorPenalidade; // Adiciona penalidade se o saldo estiver abaixo do mínimo
        }
        try {
            super.depositar(jurosMensal);
            super.sacar(valorTarifa);
        } catch (OperacaoInvalidaException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}