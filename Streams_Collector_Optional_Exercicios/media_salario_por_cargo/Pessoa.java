public class Pessoa implements Comparable<Pessoa> {

private int codigo;
private String nome;
private String cargo;
private int idade;
private double salario;

public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
    this.codigo = codigo;
    this.nome = nome;
    this.cargo = cargo;
    this.idade = idade;
    this.salario = salario;
}


public int getCodigo() {
    return codigo;
}


public String getNome() {
    return nome;
}


public String getCargo() {
    return cargo;
}


public int getIdade() {
    return idade;
}


public double getSalario() {
    return salario;
}


@Override
public String toString() {
    return String.format(new java.util.Locale("pt", "BR"),"[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario);
}


@Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }


}