import model.entiites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //ENTRADA DE DADOS
        System.out.print("Room number: ");
        int number = scanner.nextInt();
        System.out.print("Checkin date (dd/mm/yyyy): ");
        Date checkin = sdf.parse(scanner.next());
        System.out.print("checkout date (dd/mm/yyyy): ");
        Date checkout = sdf.parse(scanner.next());

        if (!checkout.after(checkin)){
            System.out.println("Error in reservation: Checkout date must be after checkin date.");
        }
        else {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation.toString());

            //ATUALIZAÇÃO DE DATAS

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Checkin date (dd/mm/yyyy): ");
            checkin = sdf.parse(scanner.next());
            System.out.print("checkout date (dd/mm/yyyy): ");
            checkout = sdf.parse(scanner.next());

            Date now = new Date();
            if (checkin.before(now) || checkout.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates.");
            }
            else if (!checkout.after(checkin)){
                System.out.println("Error in reservation: Checkout date must be after checkin date.");
            }
            else {
                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation: " + reservation.toString());
            }
        }

        scanner.close();
    }
}