package exercicio1;

import exercicio1.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123512, "Matheus", 5000);
        BankAccount b2 = new BankAccount(12223, "Guilherme");
        BankAccount b3 = new BankAccount();
        b1.Deposito(200);
        b1.Saque(5);
        b2.Saque(5);
        b2.Deposito(10);

    }
}