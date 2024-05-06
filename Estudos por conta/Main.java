import exercicio1.Triangle;
import exercicio2.Product;
import exercicio3.Rectangle;
import exercicio4.Employee;
import exercicio5.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sem usar classes
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3;
        System.out.println("Enter the measures of the triangle X: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        System.out.println("Enter the measures of the triangle Y: ");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();

        double p = (x1+x2+x3) / 2;
        double areaX = Math.sqrt(p * (p-x1) * (p-x2) *(p-x3));

        p = (y1+y2+y3) / 2;
        double areaY = Math.sqrt(p * (p-y1) * (p-y2) *(p-y3));

        System.out.printf("Triangle area X: %.4f%n", areaX);
        System.out.printf("Triangle area Y: %.4f%n", areaY);

        if (areaX>areaY){
            System.out.println("Larger area = X");
        }
        else {
            System.out.println("Larger area = Y");
        }
        sc.close();


        //Usando classes
        Triangle x = new Triangle(3.00,4.00,5.00);
        Triangle y = new Triangle(7.50,4.50,4.02);

        areaX = x.Area();
        areaY = y.Area();

        System.out.printf("Triangle area X: %.4f%n", areaX);
        System.out.printf("Triangle area Y: %.4f%n", areaY);


        //Product
        Product p1 = new Product("BOLA DE FUT", 55.50, 10);
        System.out.println(p1.toString());
        double value = p1.TotalValueInStock();
        System.out.println(value);
        p1.AddProduct(10);
        p1.RemoveProduct(5);
        value = p1.TotalValueInStock();
        System.out.println(value);
        System.out.println(p1.toString());


        //Rectangle
        Rectangle r1 = new Rectangle(4.00,3.00);
        System.out.println(r1.Area());
        System.out.println(r1.Perimeter());
        System.out.println(r1.Diagonal());


        //Employee
        Employee e1 = new Employee("Matheus", 4000, 500);
        System.out.println(e1.toString());
        System.out.println(e1.NetSalary());
        e1.IncreaseSalary(10);
        System.out.println(e1.toString());

        //Student
        Student s1 = new Student("Matheus", 30.00, 30.00, 30.00);
        s1.finalGrade();
        Student s2 = new Student("Lucas", 10.00, 30.00, 10.00);
        s2.finalGrade();
    }
}