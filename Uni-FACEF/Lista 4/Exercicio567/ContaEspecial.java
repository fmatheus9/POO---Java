package Exercicio567;

public class ContaEspecial {
    private String nome;
    private float salario;
    private int num_conta;
    private float saldo;
    private float limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String nome, float salario, int num_conta, float saldo, float limite) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setNum_conta(num_conta);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite < salario * 3){
            this.limite = limite;
        }
        else {
            this.limite = this.salario;
        }
    }

    public void Deposito(float valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    public boolean Retira(float valor){
        if (valor <= this.limite){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        else {
            return false;
        }
    }
    public void Saldo(){
        System.out.println(this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", num_conta=" + num_conta +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
