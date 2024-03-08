public class Main {
    public static void main(String[] args) {
        // crie três produtos, prod1, prod2 e prod3, com valores
        // quaisquer para suas variáveis
        // crie dois carrinhos de compra
        // o primeiro carrinho deve conter os itens de carrinho
        // relacionados aos produtos prod1 e prod2
        // o segundo carrinho deve conter os itens de carrinho
        // relacionados aos produtos prod2 e prod3
        // os valores dos itens de carrinho e dos carrinhos podem
        // ter valores quaisquer
    }
}




//PRODUCT É INDEPENDENTE DO CARITEM.
//AGRAGAÇÃO ENTRE A CLASSE CARITEM E PRODUCT
//CLASSE PARTE
public class Product {
    private int id;
    private float price;
    private String name;

    public Product() {
    }
    public Product(int id, float price, String name) {
        this.setId(id);
        this.setPrice(price);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}






//AGRAGAÇÃO ENTRE A CLASSE CARITEM E PRODUCT
//CLASSE TODO
//COMPOSIÇÃO ENTRE SHOPPING CART E CAR ITEM
//CLASSE PARTE
public class CarItem {
    private int id;
    private int quantidade;
    Product product; //Objeto Parte dentro do objeto Todo.

    public CarItem() {
    }

    public CarItem(int id, int quantidade, Product product) {
        this.setId(id);
        this.setQuantidade(quantidade);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    //PERGUNTA DE PROVA = O TOSTRING DESSA CLASSE, NA PARTE PRODUCT MOSTRA O TOSTRING DA CLASSE PRODUCT
    public String toString() {
        return "CarItem{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", product=" + product +
                '}';
    }

}






//COMPOSIÇÃO ENTRE SHOPPING CART E CAR ITEM
//SHOPPING CART É A CLASSE TODO.
//a classe parte depende do todo são dependentes
//se o todo for eliminado, a parte será também
//Não tem como o carrinho de compras existir se não tiver itens dentro dele.

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItem;

    public ShoppingCart() {
        //alocar espaço na memória para o vetor
        this.carItem = new ArrayList<CarItem>();
    }

    //O CONSTRUTOR COM PARÂMETRO NÃO FAZ COM O CARITENS POIS NÃO TEM COMO CRIAR O CARITEM SE ELE NÃO
    // FOR INICIALIZADO PREVIAMENTE

    public ShoppingCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CarItem> getCarItem() {
        return carItem;
    }

    public void setCarItem(List<CarItem> carItem) {
        this.carItem = carItem;
    }

    //MÉTODO PARA ADICIONAR UM CARITEM NO VETOR
    //CARACTERIZA UMA COMPOSIÇÃO POIS O CARITEM É CRIADO EM FUNÇÃO DO SHOPPINGCART
    public void addCarrinho(int id, int quantidade, Product product){
        //cria um CarItem e adiciona dentro do vetor
        this.carItem.add(new CarItem(id,quantidade,product));
    }

    @Override
    public String toString() { //O TOSRING 'CARITEM' É UMA LISTA, VAI MOSTRAR TODOS OS 'CARITEM's'
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItem=" + carItem +
                '}';
    }
}

