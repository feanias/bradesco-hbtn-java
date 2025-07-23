import exceptions.*;

public class ContaBancariaBasica{
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0.0; // Inicializa o saldo como zero
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }


    public double calcularTarifaMensal(){
        double valorTarifa = saldo * 0.10;
        double valorMaxTarifa = 10.0;
        if(valorTarifa > valorMaxTarifa){
            return valorTarifa = valorMaxTarifa;
        }else{
            return valorTarifa;
        }
    }

    public double calcularJurosMensal(){
        double jurosMensal = (taxaJurosAnual / 12) / 100;
        if(saldo <= 0){
            return 0.0; // Se o saldo for zero ou negativo, não há juros a serem calculados
        }else{
            return saldo * jurosMensal;
        }
    }  
    
    public void aplicarAtualizacaoMensal(){
        double valorTarifa = calcularTarifaMensal();
        double jurosMensal = calcularJurosMensal();
        this.saldo = saldo - valorTarifa + jurosMensal;
        
    }
}