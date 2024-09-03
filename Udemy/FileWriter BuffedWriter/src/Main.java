import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String path = new String("C:\\Users\\harlo\\Desktop\\Novo(a) Documento de Texto1.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for (String line: lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}