import java.security.spec.RSAOtherPrimeInfo;
import java.util.Objects;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("AU! AU!");
    }
    public void reagir(String frase){
        if (Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Olá")){
            System.out.println("Abanar e latir");
        }
        else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if (hora < 12){
            System.out.println("Abanar rabo.");
        }
        else if(hora>18){
            System.out.println("Ignorar.");
        }
        else {
            System.out.println("Abanar e latir.");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }
        else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar");
            }
            else {
                System.out.println("Latir");
            }
        }
        else {
            if (peso<10){
                System.out.println("Rosnar");
            }
            else {
                System.out.println("Ignorar");
            }
        }
    }
}
