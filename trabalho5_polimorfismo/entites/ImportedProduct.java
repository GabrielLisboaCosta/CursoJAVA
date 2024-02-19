package trabalho5_polimorfismo.entites;

public class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String nome, double price, double customsFee) {
        super(nome, price);
        this.customsFee = customsFee;
        totalPrice();
    }

    public double getCustomsFee() {
        return customsFee;
    }
    public void totalPrice(){
        price += customsFee;
    }
    @Override
    public void priceTag() {
        System.out.println(nome + " $" + String.format("%.2f", price) + " (Customs fee: $" + String.format("%.2f", customsFee)+")");
    }
}
