package trabalho8_arquivos.entites;

public class Produto {
    private String nome;
    private double price;
    private int quant;
    private double totalPrice;

    public Produto(String nome, double price, int quant) {
        this.nome = nome;
        this.price = price;
        this.quant = quant;
        calcPrice();
    }

    public String getNome() {
        return nome;
    }


    public double getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }
    public void calcPrice(){
        totalPrice = quant*price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", quant=" + quant +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
