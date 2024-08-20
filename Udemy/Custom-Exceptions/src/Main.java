import model.entiites.Reservation;
import model.excepions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            //ENTRADA DE DADOS
            System.out.print("Room number: ");
            int number = scanner.nextInt();
            System.out.print("Checkin date (dd/mm/yyyy): ");
            Date checkin = sdf.parse(scanner.next());
            System.out.print("checkout date (dd/mm/yyyy): ");
            Date checkout = sdf.parse(scanner.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation.toString());

            //ATUALIZAÇÃO DE DATAS

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Checkin date (dd/mm/yyyy): ");
            checkin = sdf.parse(scanner.next());
            System.out.print("checkout date (dd/mm/yyyy): ");
            checkout = sdf.parse(scanner.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation.toString());
        }
        catch (ParseException e){
            System.out.println("Invalid date format.");
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }


        scanner.close();
    }
}