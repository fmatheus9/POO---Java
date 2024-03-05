//Main
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123,"Matheus", 19,8f, 9f);
        a1.notaFinal();
        a1.dadosAluno();
    }
}

//class Aluno
public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public Aluno() {
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Valor do númeroAluno inválido");
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
            System.out.println("Valor do nome inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<=0){
            System.out.println("Idade inválida.");
        }
        else {
            this.idade = idade;
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1<0){
            System.out.println("Nota 1 inválida.");
            this.p1 = 0;
        }
        else {
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2<0){
            System.out.println("Nota 2 inválida.");
            this.p2 = 0;
        }
        else {
            this.p2 = p2;
        }
    }

    public void notaFinal(){
        if (this.getP2() >=0 || this.getP1() >=0) {
            System.out.println("Nota final = " + (this.getP1() + this.getP2()) / 2);
        }
        else {
            System.out.println("Valores inválidos informados");
        }
    }
    public void dadosAluno(){
        if(getNome().length() > 30){
            System.out.println("Informe um nome válido.");
        }
        else {
            System.out.println("Nome: " + this.getNome());
            System.out.println("Idade: " + this.getIdade());
            System.out.println("Numero: " + this.getNumeroAluno());
        }
    }
}

