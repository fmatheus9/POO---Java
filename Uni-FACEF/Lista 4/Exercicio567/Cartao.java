package Exercicio567;

public class Cartao  {
    private Conta conta = new Conta();
    private int senha;

    public Cartao() {
    }

    public Cartao(Conta conta, int senha) {
        this.setConta(conta);
        this.setSenha(senha);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void Deposito(float valor, int senha){
        conta.Saldo();
        if (this.senha == senha){
            this.conta.setSaldo(this.conta.getSaldo() + valor);
        }
        else {
            System.out.println("Senha incorreta.");
        }
    }

    public boolean Retira(int senha, float valor){
        conta.Retira(valor);
        if (valor <= this.conta.getLimite() && this.senha == senha){
            this.conta.setSaldo(this.conta.getSaldo() - valor);
            return true;
        }
        else {
            return false;
        }
    }

    public void Saldo(int senha){
        System.out.println(this.conta.getSaldo());
    }

    public void AlterarSenha(int senha, int novasenha){
        if (this.senha == senha){
            setSenha(novasenha);
            System.out.println("Senha alterada");
        }
        else {
            System.out.println("Senha incorreta.");
        }
    }

    @Override
    public String toString() {
        return "Cartao{" +
                 conta +
                ", senha=" + senha +
                '}';
    }
}
