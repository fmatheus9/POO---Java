public class Ave extends Animal{
    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    private String corPenas;
    @Override
    void locomover() {
        System.out.println("Voando.");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo insetos.");
    }

    @Override
    void emitirSom() {
        System.out.println("Piando.");
    }

    public void fazerNinho(){
        System.out.println("Construindo ninho.");
    }
}
