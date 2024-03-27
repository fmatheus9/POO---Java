//MAIN
public class Main {
    public static void main(String[] args) {
        Assistente a1 = new Assistente("Matheus", "Franca", "40020010089", 1000, 10);
        Gerente g1 = new Gerente("Marcelo" , "Franca" , "12345678910", 3000, 120);
        Diretor d1 = new Diretor("Danil", "Franca", "10987654321", 5000, 500);
        System.out.println(a1.toString());
        System.out.println(g1.toString());
        System.out.println(d1.toString());
        System.out.println(a1.calcularSalario());
        System.out.println(g1.calcularSalario());
        System.out.println(d1.calcularSalario());
    }
}
//CLASSE FUNCIONARIOS
public class Funcionario {
    protected String nome, endereco, cpf;
    protected  float salatio;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, float salatio) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalatio(salatio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalatio() {
        return salatio;
    }

    public void setSalatio(float salatio) {
        this.salatio = salatio;
    }

    public float calcularSalario(){
        return this.salatio;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salatio=" + salatio +
                '}';
    }
}

//CLASSE ASSISTENTES
public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente(){
        super();
    }

    public Assistente(String nome, String endereco, String cpf, float salatio, float horaExtra) {
        super(nome, endereco, cpf, salatio);
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + this.horaExtra * 50;
    }
}

//CLASSE GERENTE
public class Gerente extends Funcionario{
    private float bonus;
    public Gerente(){
        super();
    }
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.setBonus(bonus);
    }
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() + "bonus=" + bonus +
                '}';
    }
    @Override
    public float calcularSalario() {
        return super.calcularSalario() + this.bonus;
    }
}

//CLASSE DIRETOR
public class Diretor extends Funcionario{
    private float acoesEmpresa;

    public Diretor(){
        super();
    }
    public Diretor(String nome, String endereco, String cpf, float salatio, float acoesEmpresa) {
        super(nome, endereco, cpf, salatio);
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() +  "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    @Override
    public float calcularSalario() {
        return super.calcularSalario() + (this.getAcoesEmpresa()*2) / 12;
    }
}
