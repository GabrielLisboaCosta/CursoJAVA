package trabalho5_polimorfismo.entites;

import java.util.ArrayList;

public class Product {
    protected String nome;
    protected double price;
    private final ArrayList<Product> productList = new ArrayList<>();

    public Product(){
    }
    public Product(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void priceTag(){
        System.out.println(nome + " $" + String.format("%.2f", price));
    }
}
