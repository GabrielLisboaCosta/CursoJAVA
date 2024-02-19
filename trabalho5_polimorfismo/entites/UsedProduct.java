package trabalho5_polimorfismo.entites;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.zip.DataFormatException;

public class UsedProduct extends Product{
    private LocalDate manufactuteDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String nome, double price, String manufactuteDate) {
        super(nome, price);
        String dataCerta = conversorData(manufactuteDate);
        this.manufactuteDate = LocalDate.parse(dataCerta);
    }
    public String conversorData(String data){
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6);
        return (ano + "-" + mes + "-" + dia);
    }

    public LocalDate getManufactuteDate() {
        return manufactuteDate;
    }
    @Override
    public void priceTag() {
        System.out.println(nome + "(used) $" + String.format("%.2f", price) + " (Manufacture date: " +
                manufactuteDate.getDayOfMonth() +"/"+manufactuteDate.getMonth()+"/"+manufactuteDate.getYear()+  ")");
    }
}
