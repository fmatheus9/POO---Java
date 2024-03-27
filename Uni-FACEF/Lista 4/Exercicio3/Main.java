package Exercicio3;

public class Main {
    public static void main(String[] args) {

        Radio r1 = new Radio(123, 10, "The Beatles", 97.7f);
        System.out.println(r1.testaUnidade());
        System.out.println(r1.Escutar());
        r1.setaVolume(9);
        r1.trocaEstacao(99.9f);
        r1.trocaBanda("Queen");
        System.out.println(r1.toString());

        TV t1 = new TV(123,10,"SBT");
        System.out.println(t1.testaUnidade());
        System.out.println(t1.Assistir());
        t1.setaVolume(9);
        t1.trocaCanal("BAND");
        System.out.println(t1.toString());
    }
}
