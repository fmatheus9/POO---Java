package Exercicio3;

public class TV extends Produto{
    private String canal;

    public TV(String canal) {
        this.canal = canal;
    }

    public TV(int serial, int volume, String canal) {
        super(serial, volume);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public boolean testaUnidade() {
        return super.testaUnidade();
    }

    @Override
    public void setaVolume(int volume) {
        super.setaVolume(volume);
    }

    public String Assistir(){
        return "Assistindo: " + this.getCanal();
    }
    public void trocaCanal(String canal){
        setCanal(canal);
    }

    @Override
    public String toString() {
        return "TV{" +
                "canal='" + canal + '\'' +
                super.toString() +
                '}';
    }
}
