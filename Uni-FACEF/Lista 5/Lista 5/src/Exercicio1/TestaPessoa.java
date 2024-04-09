package Exercicio1;

public class TestaPessoa {
    public static void main(String args[]){
        Pessoa objPessoa = new Pessoa("123", "456");
        objPessoa.ensina(); objPessoa.trabalha();
        objPessoa.tiraCpf(); objPessoa.pagaIr();
        objPessoa.tiraRg(); objPessoa.vota();
        objPessoa.come(); objPessoa.respira();

        Contribuinte objContribuinte = new Pessoa("234", "567");
        objContribuinte.pagaIr();
        objContribuinte.tiraCpf();

        Professor objProfessor = new Pessoa("345", "678");
        objProfessor.ensina();
        objProfessor.trabalha();

    }
}
