package services;

import entities.CarRental;
import entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double procePerDay;
    private BrazilTaxService brazilTaxService;

    public RentalService(double pricePerHour, double procePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.procePerDay = procePerDay;
        this.brazilTaxService = brazilTaxService;
    }


    public void processInvoice(CarRental carRental){
        Long minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = procePerDay * Math.ceil(hours/24);

        }

        double tax = brazilTaxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
