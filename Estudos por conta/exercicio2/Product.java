package exercicio2;
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //METODOS
    public double TotalValueInStock(){
        return this.getPrice() * this.getQuantity();
    }
    public void AddProduct(int quantity){
        setQuantity(getQuantity() + quantity);
    }
    public void RemoveProduct(int quantity){
        if (this.getQuantity() > quantity){
            this.setQuantity(getQuantity() - quantity);
        }
        else {
            System.out.println("It is not possible to realize this operation. ");
        }
    }

    @Override
    public String toString() {
        return "Product data: Name '" + this.name + "', price: $" + this.price + ", " + this.quantity + " units. Total price: $" + this.price*this.quantity;
    }
}
