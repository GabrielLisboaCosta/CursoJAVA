package trabalho4_compisicao.aplication;

import trabalho4_compisicao.entites.Client;
import trabalho4_compisicao.entites.Order;
import trabalho4_compisicao.entites.OrderItem;
import trabalho4_compisicao.entites.Product;
import trabalho4_compisicao.enums.OrderStatus;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        LocalDateTime momentPed = LocalDateTime.now();
        System.out.println("Enter cliente data:");
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.nextLine();
        System.out.print("Bith date (DD/MM/YYYY): ");
        String data = teclado.nextLine();
        System.out.println("Status: " + OrderStatus.PROCESSING);
        Client novoCLiente = new Client(nome, email, data);
        System.out.println("Quantos pedidos? ");
        int quant = teclado.nextInt();
        Order novaOrdem = new Order(momentPed, OrderStatus.PROCESSING, novoCLiente);


        for (int i=0; i<quant; i++) {
            System.out.print("Product Name: ");
            teclado.nextLine();
            String nomeProduto = teclado.nextLine();
            System.out.print("Product Price: ");
            double precoProduto = teclado.nextDouble();
            System.out.print("Quantity: ");
            int quantProduto = teclado.nextInt();
            Product novoProd = new Product(nomeProduto, precoProduto);
            OrderItem newOrder = new OrderItem(quantProduto, novoProd);
            novaOrdem.addItem(newOrder);
            System.out.println("------------------------");
        }

        System.out.println(novaOrdem);
        novaOrdem.listaItens();

        teclado.close();
    }
}
