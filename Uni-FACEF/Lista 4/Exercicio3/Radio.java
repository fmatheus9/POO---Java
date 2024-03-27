package Exercicio3;

public class Radio extends Produto{
    private String banda;
    private float estacao;
    public Radio() {
    }

    public Radio(int serial, int volume, String banda, float estacao) {
        super(serial, volume);
        this.setBanda(banda);
        this.setEstacao(estacao);
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    @Override
    public boolean testaUnidade() {
        return super.testaUnidade();
    }

    @Override
    public void setaVolume(int volume) {
        super.setaVolume(volume);
    }

    public String Escutar(){
        return "Escutando a Banda: " + this.banda + " Estação: " + this.estacao;
    }

    public void trocaEstacao(float estacao){
        setEstacao(estacao);
    }
    public void trocaBanda(String banda){
        setBanda(banda);
    }

    @Override
    public String toString() {
        return "Radio{" +
                "banda='" + banda + '\'' +
                super.toString() +
                '}';
    }
}
