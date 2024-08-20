import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        }

        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Invalid position.");
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Input error");
        }

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed.");
        }


        System.out.println("End of program.");

        scanner.close();
    }
}