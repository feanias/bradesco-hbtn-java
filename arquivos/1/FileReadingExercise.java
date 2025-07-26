import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {
    public static void main(String[] args) throws IOException {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura
        fileName = "../1/" + fileName; // Caminho do arquivo
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            System.out.println("Conteúdo do arquivo 'exemplo.txt':");
            String line = null;
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("\n");
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo: " + ex.getMessage());
        } finally {
            // Aqui você pode fechar o BufferedReader se necessário
            System.out.println("Leitura do arquivo concluída.");
            br.close();
        }

    }
}
