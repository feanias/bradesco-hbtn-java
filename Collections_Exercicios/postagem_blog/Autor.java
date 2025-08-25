public class Autor implements Comparable<Autor>{
    
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobrenome);
    }

    @Override
    public int compareTo(Autor outro) {
        int compararNome = this.nome.compareTo(outro.nome);
        if (compararNome != 0) {
            return compararNome;
        }
        return this.sobrenome.compareTo(outro.sobrenome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome) && this.sobrenome.equals(outro.sobrenome);
    }
    

}
