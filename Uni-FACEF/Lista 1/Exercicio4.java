//Main
public class Main {
    public static void main(String[] args) {
    Rio r1 = new Rio();
    Rio r2 = new Rio("Rio Grande", 11f, false);
    r2.chover(2f);
    r2.ensolarar(3f);
    r2.sujar();
        System.out.println(r2.toString());
    }
}
//Classe
public class Rio {
    private String nome;
    private float nivel;
    private boolean poluido;

    //METODOS ESPECIAIS


    public Rio() {
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }

    public boolean isPoluido() {
        return poluido;
    }

    public void setPoluido(boolean poluido) {
        this.poluido = poluido;
    }

    //METODOS
    public void chover(float x){
        setNivel(getNivel()+x);
    }
    public void ensolarar(float x){
        if (x>getNivel()){
            System.out.println("O rio secou :(");
        }
        else {
            setNivel(getNivel() - x);
        }
    }
    public void limpar(){
        setPoluido(true);
    }
    public void sujar(){
        setPoluido(false);
    }

    public String toString() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}';
    }

}
