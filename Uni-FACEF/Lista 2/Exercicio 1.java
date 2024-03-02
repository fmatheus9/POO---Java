//Main
public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("123456-7", "1234-5","Matheus Ferrarezi", 10f);
        System.out.println(fulano.toString());
        fulano.realizarDeposito(1000f);
        fulano.realizarDeposito(90f);
        fulano.realizarSaque(1000f);
        System.out.println(fulano.toString());
    }
}
//Classe

public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public Cliente() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8 ){
            if (numeroConta.indexOf("-") == 6) {
                this.numeroConta = numeroConta;
            }
        }
        else {
            this.numeroConta = "Valor inválido";
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6){
            if(numeroAgencia.indexOf("-") == 4){
                this.numeroAgencia = numeroAgencia;
            }
        }
        else {
            this.numeroAgencia = "Valor inválido";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 30){
            this.nome = nome;
        }
        else {
            this.nome = "Valor inválido";

        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Valor do saldo inválido. Reinsira o valor do saldo. ");
        }
    }

    public void realizarDeposito(float valor){
        if (this.numeroConta == "Valor inválido" || this.numeroAgencia == "Valor inválido"){
            System.out.println("Algum campo em pendência. Impossivel realizar o depósito.");
        }
        else {
            this.setSaldo(this.getSaldo() + valor);
        }

    }
    public void realizarSaque(float valor){
        if (this.numeroConta == "Valor inválido" || this.numeroAgencia == "Valor inválido"){
            System.out.println("Algum campo em pendência. Impossivel realizar o saque.");
        }
        else {
            if (valor > this.getSaldo()) {
                System.out.println("Valor maior que o saldo na conta");
            } else {
                this.setSaldo(this.getSaldo() - valor);
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

//d)	Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set. O que acontece? 
//RESPOSTA: os atributos ficam inacessíveis.
