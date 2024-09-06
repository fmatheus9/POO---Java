package services;

public class BrazilTaxService implements InrerfaceTaxService{

    @Override
    public double tax(Double amount) {
        if (amount <= 100){
            return amount *0.2;
        }
        else {
            return amount * 0.15;
        }
    }
}