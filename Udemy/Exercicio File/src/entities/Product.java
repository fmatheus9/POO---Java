package entities;
public class Product {
    private String name;
    private Double price;
    private int qnt;

    public Product(String name, Double price, int qnt) {
        this.name = name;
        this.price = price;
        this.qnt = qnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double total(){
        return getPrice()*getQnt();
    }
}
