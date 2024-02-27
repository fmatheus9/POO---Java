public class Main {
    public static void main(String[] args) {
    Aluno a0 = new Aluno();
    Aluno a1 = new Aluno(24639,"Matheus",19, 9.4f,8.8f);
    System.out.println("Nota Final: "+ a1.notaFinal());
    a1.dadosAluno();
    a1.passou();
    }
}

// Classe
public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    //MÉTODOS ESPECIAIS
     public Aluno(){
     }
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }


    //MÉTODOS

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public void dadosAluno(){
        System.out.println("Número do aluno: " + this.getNumeroAluno());
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Idade do aluno: " + this.getIdade());
    }
    public void passou(){
        if(this.notaFinal() < 6){
            System.out.println("Aluno não aprovado.");
        }
        else {
            System.out.println("Aluno aprovado");
        }
    }

}
