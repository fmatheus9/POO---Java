package exercicio4;
public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public double NetSalary(){
        return this.grossSalary - this.tax;
    }
    public void IncreaseSalary(double percentage){
        double newSalary = this.grossSalary + this.grossSalary * (percentage/100);
        setGrossSalary(newSalary);
        System.out.println("Update salary: $" + newSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                ", tax=" + tax +
                '}';
    }
}
