package trabalho4_compisicao.entites;

import trabalho4_compisicao.enums.OrderStatus;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    List<OrderItem> listPedido = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
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
}
