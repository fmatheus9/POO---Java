import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o caminho de um arquivo: ");
        String path = scanner.nextLine();

        File file = new File(path);

        File[] folders = file.listFiles(File::isDirectory);
        System.out.println("Folders: " );
        for (File folder: folders){
            System.out.println(folder);
        }

        File[] filess = file.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file1: filess){
            System.out.println(file1);
        }
        scanner.close();
    }
}