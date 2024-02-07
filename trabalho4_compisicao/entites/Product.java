package trabalho4_compisicao.entites;

public class Product {
    private String nome;
    private double price;

    public Product(){
    }
    public Product(String nome, double preco) {
        this.nome = nome;
        this.price = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }
}
