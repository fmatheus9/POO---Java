public class Main {
    public static void main(String[] args) {
    Pessoa p[] = new Pessoa[2];
    Livro l[] = new Livro[3];
    p[0] = new Pessoa("Felipe", 21, "Masc");
    p[1] = new Pessoa("Maria", 17, "Fem");
    l[0] = new Livro("AMARELO", "Yellow", 212, p[0]);
    l[1] = new Livro("AZUL", "Blue", 240, p[1]);
    l[2] = new Livro("VERDE", "Green", 300, p[1]);

    l[0].detalhes();
    p[0].fazerAniverssario();
    l[0].abrir();
    for (int i = 1; i<100; i++ ){
        l[0].avançarPagina();
    }
    l[0].detalhes();
    }
}
