package Exercicio3;
import java.util.Random;
public abstract class Produto {
    protected int serial;
    protected int volume;
    String Teste = "nao testado";

    public Produto() {
    }

    public Produto(int serial, int volume) {
        this.setSerial(serial);
        this.setVolume(volume);
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean testaUnidade(){
        Random random = new Random();
        float num = random.nextFloat(0,1);
        if (num > 0.1){
            Teste = "aprovado";
            return true;
        }
        else {
            Teste = "reprovado";
            return false;
        }
    }

    public void setaVolume(int volume){
        setVolume(volume);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serial=" + serial +
                ", volume=" + volume +
                ", teste='" + Teste + '\'' +
                '}';
    }
}
