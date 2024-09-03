import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = new String("C:\\Users\\harlo\\Desktop\\Novo(a) Documento de Texto.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }

    }
}