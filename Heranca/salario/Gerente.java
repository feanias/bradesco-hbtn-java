public class Gerente extends Empregado{
    
   @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double valorBonus = (departamento.getValorAtingidoMeta()  - (departamento.getValorMeta()) )* 0.01;
            return (getSalarioFixo() * 0.2) + valorBonus; // 20% bonus for managers if the department met its goal
        }
        return 0; // no bonus if the goal was not met
    }

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    

}
