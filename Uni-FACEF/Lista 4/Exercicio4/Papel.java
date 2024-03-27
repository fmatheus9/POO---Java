package Exercicio4;

public class Papel extends Coisa {
    @Override
    public String QuemSouEu() {
        return "Papel";
    }
    @Override
    public void Compara(Coisa c) {
        if (c.QuemSouEu().equals("Papel")){
            System.out.println("Empate");
        }
        else if (c.QuemSouEu().equals("Pedra")){
            System.out.println("Papel ganha de Pedra");
        }
        else if (c.QuemSouEu().equals("Tesoura")){
            System.out.println("Papel perde de Tesoura");
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}
