import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        System.out.println("Conteúdo do arquivo 'exemplo.txt':\n");
        //
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String linha = br.readLine();
            while(Objects.nonNull(linha)) {
                System.out.println(linha);
                proximaLinha = br.readLine();
            }
            System.out.println("\nLeitura do arquivo concluída.");

        } catch (Exception  e) {
            System.out.println("Erro ao processar arquivo.");
        }
    }
}
