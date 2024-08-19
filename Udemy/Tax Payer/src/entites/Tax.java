package entites;
public abstract class Tax {
    protected String name;
    protected double annualRent;

    public Tax(String name, double annualRent) {
        this.name = name;
        this.annualRent = annualRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualRent() {
        return annualRent;
    }

    public void setAnnualRent(double annualRent) {
        this.annualRent = annualRent;
    }

    public abstract double taxCalculation();


}
