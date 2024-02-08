package trabalho4_compisicao.entites;

public class OrderItem {
    private int quantity;
    private double pricePed;
    private Product prod;

    public OrderItem(){
    }

    public OrderItem(int quantity, Product prod) {
        this.quantity = quantity;
        this.prod = prod;
    }

    public double subTotal(){
        pricePed = quantity*prod.getPrice();
        return pricePed;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return pricePed;
    }

    public Product getProd() {
        return prod;
    }
}
