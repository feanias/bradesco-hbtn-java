public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaLinear
    public void buscaLinear(String nome){
        boolean encontrado = false;
        System.out.println("Procurando pelo nome: " + nome);
        for(int i = 0 ; i < nomes.length ; i++){
            System.out.println("Passando pelo indice:" + i);
            if(nome.equals(nomes[i])){
                System.out.printf("Nome pesquisado é %s que está na posição %s \n",nome, i);
                encontrado = true;
            }   
        }
        if(!encontrado){
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
        }
        
    }
}