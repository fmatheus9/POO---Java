public class Main {
    public static void main(String[] args) {
    Visitante v1 = new Visitante();
    v1.setNome("Felipe");
    v1.setIdade(19);
    v1.setSexo("Masculino");
    v1.status();

    Aluno a1 = new Aluno();
    a1.setNome("Matheus");
    a1.setIdade(19);
    a1.setSexo("Masculino");
    a1.pagarMensalidade();
    a1.fazerAni();
    a1.status();

    Bolsista b1 = new Bolsista();
    b1.setNome("Carlo");
    b1.pagarMensalidade();
    }
}
