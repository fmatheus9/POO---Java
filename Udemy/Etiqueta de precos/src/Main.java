import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product Data " + (i+1) + ": ");
            System.out.print("Common, used or imported (c/u/i): ");
            char cui = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (cui == 'i'){
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product p1 = new ImportedProduct(name, price, customsFee);
                productList.add(p1);

            } else if (cui == 'u') {
                System.out.print("Manufacture Date (dd/mm/yyyy): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product p1 = new UsedProduct(name, price, manufactureDate);
                productList.add(p1);
            }
            else {
                Product p1 = new Product(name, price);
                productList.add(p1);
            }

        }

        for (Product p1: productList){
            System.out.println(p1.priceTag());
        }

        sc.close();
    }
}