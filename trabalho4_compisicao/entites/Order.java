package trabalho4_compisicao.entites;

import trabalho4_compisicao.enums.OrderStatus;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client cliente;
    List<OrderItem> listPedido = new ArrayList<>();

    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.cliente = client;
    }
    public void addItem(OrderItem item){
        listPedido.add(item);
    }
    public void removeItem(OrderItem item){
        listPedido.remove(item);
    }
    public double total(){
        double result = 0;
        for (OrderItem x:listPedido) {
            result += x.subTotal();
        }
        return result;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getCliente() {
        return cliente;
    }
    public void listaItens(){
        for(OrderItem x: listPedido){
            System.out.print(x.getProd().getNome());
            System.out.printf(", R$%.2f", x.getProd().getPrice());
            System.out.print(", Quantity: "+ x.getQuantity());
            System.out.printf(", Subtotal: R$%.2f\n", x.subTotal());
        }
        System.out.printf("\nTotal price: R$%.2f", total());
    }

    @Override
    public String toString() {
        return "ORDER SUMARY: " +
                "\nOrder moment: " + getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +
                "\nOrder status: " + getStatus() +
                "\nClient: " + getCliente().getNome() +"("
                + getCliente().getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +") - " +
                getCliente().getEmail() +
                "\nOrder items:";
    }
}
