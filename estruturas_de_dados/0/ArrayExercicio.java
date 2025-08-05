import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        System.out.println("Digite 10 números inteiros:");
        //for para aceitar os numeros do teclado e adicionar a soma   
        for(int i = 0; i <= tamanhoArray-1; i++){
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(scanner.next());
            //adiciona soma
            soma += numeros[i];
        }
        
        //imprimir o array
        System.out.println("Conteudo do array:");
        for(int c=0; c <=tamanhoArray-1; c++){
            System.out.print(numeros[c] + " ");
        }
        
        //mostra a soma
        System.out.println("\nSoma de todos os números: "+ soma);

        //encontrar o maior - primeiro ordena e dps pega a ultima posicao
        Arrays.sort(numeros);
        maiorNumero = numeros[9];


        //imprimir maior
        System.out.println("Maior número no array: " + maiorNumero);

        // Fechando o scanner
        scanner.close();
    }
}
