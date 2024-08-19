package entites;

public class Individual extends Tax{
    private double healthCare;

    public Individual(String name, double annualRent, double healthCare) {
        super(name, annualRent);
        this.healthCare = healthCare;
    }

    public double getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(double healthCare) {
        this.healthCare = healthCare;
    }

    @Override
    public double taxCalculation() {
        if (annualRent < 20000){
            return  (getAnnualRent() * 0.15);
        }
        else {
            return (getAnnualRent() * 0.25) - getHealthCare() * 0.5;
        }

    }

    @Override
    public String toString() {
        return getName() + ": $" + taxCalculation();
    }
}
