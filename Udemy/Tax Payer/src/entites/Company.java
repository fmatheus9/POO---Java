package entites;

public class Company extends Tax{
    private int employees;

    public Company(String name, double annualRent, int employees) {
        super(name, annualRent);
        this.employees = employees;
    }

    public double getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double taxCalculation() {
        if (employees< 10){
            return (getAnnualRent() * 0.16);
        }
        else {
            return (getAnnualRent() * 0.14);
        }
    }
    @Override
    public String toString() {
        return getName() + ": $" + taxCalculation();
    }
}
