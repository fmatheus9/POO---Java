package Exercicio1;

public class Pessoa extends Animal implements Cidadao, Contribuinte,
        Professor{
    private String rg, cpf;
    public Pessoa(){
        super();
    }
    public Pessoa(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void vota() {
        System.out.println("Pessoa com RG " + this.rg + " votou");
    }
    @Override
    public void tiraRg() {
        System.out.println("Rg foi tirado " + this.rg);
    }
    @Override
    public void pagaIr() {
        System.out.println("Pessoa com CPF " + this.cpf + " pagando IR");
    }
    @Override
    public void tiraCpf() {
        System.out.println("CPF foi tirado " + this.cpf);
    }
    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhou ");
    }
    @Override
    public void ensina() {
        System.out.println("Pessoa ensinou");
    }
}