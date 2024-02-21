public class Peixe extends Animal{
    private String corEscama;
    @Override
    void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo algas.");
    }

    @Override
    void emitirSom() {
        System.out.println("Peixe não faz som xd.");
    }

    public void soltarBolhas(){
        System.out.println("Soltando bolhas.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
