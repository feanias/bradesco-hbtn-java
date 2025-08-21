import java.util.List;

public class ManipularArrayNumeros {

    static public int buscarPosicaoNumero(List<Integer> lista, int numero ){
        try{
            return lista.indexOf(numero);
        }catch(Exception e){
            return -1;
        }
    }

    static public void adicionarNumero(List<Integer> lista, int numero){
        try {
            int resultado = buscarPosicaoNumero(lista, numero);
            if(resultado == -1){
                lista.add(numero);
            }else{
                throw new Exception("Numero jah contido na lista");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
    }


    static public void removerNumero(List<Integer> lista, int numero){
        try {
            int resultado = buscarPosicaoNumero(lista, numero);
            if(resultado == -1){
                throw new Exception("Numero nao encontrado na lista");
            }else{
                lista.remove(resultado);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }

    static public void substituirNumero (List<Integer> lista, int numeroSubstituir, int numeroSubstituto){
        int resultado = buscarPosicaoNumero(lista, numeroSubstituir);
        if(resultado == -1){
            lista.add(numeroSubstituto);
        }else{
            lista.set(resultado, numeroSubstituto);
        }
    }

}
