package trabalho4_compisicao.entites;

public class OrderItem {
    private int quantity;
    private double price;

    public OrderItem(){
    }

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double subTotal(){
        return quantity*price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
