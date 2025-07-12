public class Gerente extends Empregado{
    
   @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.atingiuMeta()) {
            return getSalarioFixo() * 0.2; // 20% bonus for managers if the department met its goal
        }
        return 0; // no bonus if the goal was not met
    }

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    

}
