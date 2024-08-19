import entites.Company;
import entites.Individual;
import entites.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tax> taxes = new ArrayList<>();
        double soma = 0;

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax Payer Data " + (i+1) +": ");
            System.out.print("Individual or Company (i/c): ");
            char ic = scanner.next().charAt(0);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Annual Income: ");
            double annualRent = scanner.nextDouble();;

            if (ic == 'c'){
                System.out.print("Number of employees: ");
                int employees = scanner.nextInt();

                Tax tax = new Company(name, annualRent, employees);
                taxes.add(tax);

            }

            if (ic == 'i'){
                System.out.print("Health expenditures: ");
                double helth = scanner.nextDouble();

                Tax tax = new Individual(name, annualRent, helth);
                taxes.add(tax);

            }

        }
        System.out.println("Taxes Payed: ");
        for (Tax tax: taxes){
            System.out.println(tax.toString());
            soma = soma + tax.taxCalculation();
        }

        System.out.println("Total Taxes: " + soma);


        scanner.close();
    }
}