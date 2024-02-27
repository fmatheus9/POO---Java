//MAIN
public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto(11,100,"Sabonete Dove", 10f);
    p1.comprar(10);
    p1.vender(9);
    p1.subir(2);
    p1.descer(3);
    System.out.println(p1.toString());

    Produto p2 = new Produto(19,124,"Sabonete Protect", 9.5f);
    p2.comprar(10);
    p2.vender(9);
    p2.subir(2);
    p2.descer(3);
    System.out.println(p2.toString());
    }
}

//CLASSE
public class Produto {
    private int id, qnt;
    private String descricao;
    private float preco;

    //METODOS ESPECIAIS:
    public Produto() {

    }

    public Produto(int id, int qnt, String descricao, float preco) {
        this.id = id;
        this.qnt = qnt;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //METODOS
    public void comprar(int x){
        this.setQnt(this.getQnt() + x);
    }
    public void vender(int x){
        this.setQnt(this.getQnt() - x);
    }
    public void subir(float x){
        this.setPreco(this.getPreco() + x);
    }
    public void descer(float x){
        this.setPreco(getPreco() - x);
    }

    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", qnt=" + qnt +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
