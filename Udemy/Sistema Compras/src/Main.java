import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("-----------------------------");
        System.out.println("ENTER CLIENT DATA: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(scanner.next());

        Client client = new Client(name, email, date);

        System.out.println("-----------------------------");
        System.out.println("ENTER ORDER DATA: ");
        scanner.nextLine();
        System.out.print("Status: ");
        String status = scanner.nextLine();
        System.out.print("How many items to this order: ");
        int n = scanner.nextInt();

        Order order = new Order(Date.from(Instant.now()), OrderStatus.valueOf(status), client);
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER ITEM DATA #" + i+1 + ": ");
            System.out.print("Name: ");
            scanner.nextLine();
            String item_name = scanner.nextLine();
            System.out.print("Price: ");
            double item_price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product p1 = new Product(item_name, item_price);
            OrderItem o1 = new OrderItem(quantity, p1);
            o1.subTotal();
            order.addItem(o1);
        }

        System.out.println("-----------------------------");
        System.out.println("Order Sumary: ");
        System.out.println(order.toString());
        
        scanner.close();
    }
}