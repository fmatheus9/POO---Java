public class Main {
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.abrirConta("CC");
        c1.setDono("Matheus Ferrarezi Mesquita Fagundes");
        System.out.println("Dono da conta: " + c1.getDono());
        c1.setNumConta(1030);
        System.out.println("Número da conta: " + c1.getNumConta());
        System.out.println("Status da conta: " + c1.getStatus());
        System.out.println("Saldo da conta: " + c1.getSaldo());
        c1.depositar(150f);
        System.out.println("Saldo da conta: " + c1.getSaldo());
        c1.sacar(200f);
        System.out.println("Saldo da conta: " + c1.getSaldo());
        c1.fecharConta();
        System.out.println("Status da conta: " + c1.getStatus());
        System.out.println("");

        Conta c2 = new Conta();
        c2.abrirConta("CP");
        c2.setDono("JucaBALA");
        System.out.println("Dono da conta: " + c2.getDono());
        c2.setNumConta(1040);
        System.out.println("Número da conta: " + c2.getNumConta());
        System.out.println("Status da conta: " + c2.getStatus());
        System.out.println("Saldo da conta: " + c2.getSaldo());
        c2.depositar(1500f);
        System.out.println("Saldo da conta: " + c2.getSaldo());
        c2.sacar(1650f);
        c2.fecharConta();
        System.out.println("Status da conta: " + c1.getStatus());
        System.out.println("");
    }

}
