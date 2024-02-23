public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 13 de JAVA");
        v[2] = new Video("Herobrine a Lenda XD");

        System.out.println(v[0].toString());

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Matheus", 19, "M", "beck");
        g[1] = new Gafanhoto("Jão", 19, "M", "xarelto");

        System.out.println(g[1].toString());

        Visualizacao v1 = new Visualizacao(g[0], v[0]);
        v1.avaliar(10);


        System.out.println(v1.toString());
    }
}