package exercicio1;
public class BankAccount {
    private int number;
    private String name;
    private double deposit;

    public BankAccount(int number, String name, double deposit) {
        this.number = number;
        this.name = name;
        this.deposit = deposit;
        if (this.deposit < 0){
            this.deposit = 0;
        }
    }

    public BankAccount(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public BankAccount() {
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void Deposito(double valor){
        this.deposit = this.deposit+valor;
        System.out.println("New Data: ");
        System.out.println("Name: " + this.name + "\nNumber: " + this.number + "\nNew value: $" + this.deposit + "\n----------");
    }
    public void Saque(double valor){
        this.deposit = this.deposit-valor-5;
        System.out.println("New Data: ");
        System.out.println("Name: " + this.name + "\nNumber: " + this.number + "\nNew value: $" + this.deposit + "\n----------");


    }

}
