public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Ave a1 = new Ave();
        Peixe p1 = new Peixe();
        Cachorro c1 = new Cachorro();
        Canguru can1 = new Canguru();
        Cobra co1 = new Cobra();
        Tartaruga t1 = new Tartaruga();

        m1.setPeso(10f);
        m1.setIdade(11);
        m1.setMembros(4);
        m1.setCorPelo("Preto");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();

        r1.alimentar();
        r1.locomover();
        r1.emitirSom();

        a1.alimentar();
        a1.locomover();
        a1.emitirSom();

        p1.alimentar();
        p1.locomover();
        p1.emitirSom();

        can1.locomover();
        c1.emitirSom();
        t1.locomover();
    }
}