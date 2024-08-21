import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            System.out.print("Holder: ");
            String holder = scanner.next();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double limi = scanner.nextDouble();

            Account account = new Account(number, holder, balance, limi);

            System.out.print("Enter amount for withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);

        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        scanner.close();
    }
}