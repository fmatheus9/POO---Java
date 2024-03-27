package Exercicio4;

public class Pedra extends Coisa {
    @Override
    public String QuemSouEu() {
        return "Pedra";
    }
    @Override
    public void Compara(Coisa c) {
        if (c.QuemSouEu().equals("Pedra")) {
            System.out.println("Empate");
        }
        else if (c.QuemSouEu().equals("Papel")) {
            System.out.println("Pedra perde de Papel");
        }
        else if (c.QuemSouEu().equals("Tesoura")) {
            System.out.println("Pedra ganha de Tesoura");
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}