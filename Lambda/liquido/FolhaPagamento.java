public class FolhaPagamento {

    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario valor){
        return valor.calcular(funcionario.getSalario());
    }

}
