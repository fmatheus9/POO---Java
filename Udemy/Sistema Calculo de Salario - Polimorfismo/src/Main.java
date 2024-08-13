import entities.Employee;
import entities.OutsurcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsorced (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours worked: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();


            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsurcedEmployee(name, hour, valuePerHour, additionalCharge);
                employeeList.add(emp);
            }
            else {
                Employee emp = new Employee(name, hour, valuePerHour);
                employeeList.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp: employeeList) {
            System.out.println(emp.getName() + " - $" +emp.payment());
        }

        sc.close();
    }
}