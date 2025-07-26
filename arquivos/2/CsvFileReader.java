import java.io.BufferedReader;
import java.io.IOException;

public class CsvFileReader {

    public static void main(String[] args) throws IOException {
        String fileName = "../2/funcionarios.csv";
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] value = line.split(",");
                String nome = value[0];
                String idade = value[1];
                String cargo = value[2];
                String salario = value[3];
                System.out.println("Funcionário: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Departamento: " + cargo);
                System.out.println("Salarial: " + salario);
                System.out.println("------------------------");
            }
            System.out.println("Leitura do arquivo concluída.");
            reader.close();

        }catch(IOException e) {
            System.out.println("Arquivo não encontrado: " + fileName);
            e.printStackTrace();
        }
        
    }
    
}
