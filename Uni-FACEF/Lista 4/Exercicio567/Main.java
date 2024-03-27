package Exercicio567;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Matheus", 1500f, 12, 3000, 1000f);
        System.out.println(c1.toString());
        c1.Deposito(100);
        c1.Saldo();
        System.out.println(c1.Retira(100f));
        c1.Saldo();
        System.out.println("");

        ContaEspecial ce1 = new ContaEspecial("Matheus F", 1500f, 12, 30000, 5000f);
        System.out.println(ce1.toString());
        ce1.Deposito(100);
        ce1.Saldo();
        System.out.println(ce1.Retira(1000f));
        ce1.Saldo();
        System.out.println("");

        Cartao cartao1 = new Cartao(c1, 12345);
        System.out.println(cartao1.toString());
        cartao1.Saldo(12345);
        cartao1.Deposito(100,12345);
        cartao1.Saldo(12345);
        System.out.println(cartao1.Retira(12345, 100));
        cartao1.Saldo(12345);
        cartao1.AlterarSenha(12345,6789);
    }
}
