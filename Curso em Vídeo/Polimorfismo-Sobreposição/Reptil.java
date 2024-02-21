public class Reptil extends Animal{
    private String corEscamas;

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    @Override
    void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de réptil.");
    }
}
