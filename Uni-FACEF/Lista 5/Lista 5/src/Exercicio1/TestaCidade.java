package Exercicio1;

public class TestaCidade {
    public static void main(String args[]){
        Pessoa fulano = new Pessoa("123", "456");
        Cidade fr = new Cidade();
        fr.contrata(fulano);
        fr.contrata((Empregado) fulano);
        fr.cobraDe(fulano);
        fr.registra(fulano);
        fr.alimenta(fulano);

    }
}