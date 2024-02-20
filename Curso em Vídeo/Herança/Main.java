public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Felipe");
        p2.setNome("Pedro");
        p3.setNome("Marcia");
        p4.setNome("Cilda");

        p1.setIdade(13);
        p2.setSexo("Masc");
        p3.setEspecialidade("Matemática");
        p3.setSalario(3232.0f);
        p3.receberAumento(321.0f);
        p4.setSetor("Secretaria");

        p1.status();
        p2.status();
        p3.status();
        p4.status();

    }
}
