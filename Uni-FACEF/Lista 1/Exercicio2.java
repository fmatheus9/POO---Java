//Main
public class Main {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();

        Cliente c1 = new Cliente(1,1010,"Fulano", 1000f);
        c1.realizarDeposito(100f);
        c1.realizarSaque(10f);
        c1.dados();
        Cliente c2 = new Cliente(2,1010,"Beltrano", 1005f);
        c2.realizarDeposito(1100f);
        c2.realizarSaque(5000f);
        c2.dados();
    }
}
//Classe
public class Cliente {
    private int numeroConta, numeroAgencia;
    private String nome;
    private float saldo;

    //MÉTODOS ESPECIAIS

    public Cliente(){}
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //METODOS
    public void realizarDeposito(float valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado.");
    }
    public void realizarSaque(float valor){
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente.");
        }
        else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado.");
        }
    }

    public void dados(){
        System.out.println("Número da conta: " + this.getNumeroConta());
        System.out.println("Número da agência: " + this.getNumeroAgencia());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo atual: " + this.getSaldo());
    }

}
