import entities.Car;
import entities.CarRental;
import services.BrazilTaxService;
import services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Entrega (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, finish, new Car(modelo));

        System.out.print("Entre com o preco por hora: ");
        double hora = scanner.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        double dia = scanner.nextDouble();

        RentalService rentalService = new RentalService(hora,dia,new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());


        scanner.close();

    }
}