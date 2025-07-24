import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


 public class FileWritingExercise {
     public static void main(String[] args)  {
         Scanner scanner = new Scanner(System.in);


         // Solicita o nome do arquivo
         System.out.print("Digite o nome do arquivo (com extensão .txt): ");
         String fileName = scanner.nextLine();
        try {

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true)); // 'true' para anexar ao arquivo existente
            System.out.println("Digite o texto a ser escrito no arquivo (digite 'sair' para finalizar):");
            String entrada = scanner.nextLine();
            while (entrada != null) {
                if (entrada.contains("sair")){
                    break;
                }else{
                    bufferedWriter.write(entrada + System.lineSeparator()); // Escreve a entrada no arquivo
                    entrada = scanner.next();
                }
                 // Escreve a entrada no arquivo
            }
         bufferedWriter.close(); 
         scanner.close();
         System.out.println("Texto escrito no arquivo " + fileName + " com sucesso!");
            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
         

         
     }
 }