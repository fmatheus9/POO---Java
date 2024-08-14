import entities.Circle;
import entities.enums.Color;
import entities.Rectagle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("---> Shpae #" + (i+1) + ": ");
            System.out.print("Rectangle or Circle (r/c): ");
            char rc = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.next();
            Color color = Color.valueOf(sc.nextLine());

            if (rc == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape s1 = new Rectagle(color, width, height);
                shapeList.add(s1);

            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape s1 = new Circle(color, radius);
                shapeList.add(s1);
            }
        }

        System.out.println("---> Shape areas: ");
        for (Shape s1: shapeList){
            System.out.println(s1.area());
        }


        sc.close();
    }
}