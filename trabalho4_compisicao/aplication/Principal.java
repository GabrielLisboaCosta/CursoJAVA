package trabalho4_compisicao.aplication;

import trabalho4_compisicao.entites.Client;
import trabalho4_compisicao.enums.OrderStatus;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Email: ");
        String email = teclado.nextLine();
        System.out.print("Bith date (DD/MM/YYYY): ");
        String data = teclado.nextLine();
        System.out.println("Status: " + OrderStatus.PROCESSING);
        Client novoCLiente = new Client(nome, email, data);
        System.out.println(novoCLiente.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Quantos pedidos? ");
        int quant = teclado.nextInt();
        for (int i=0; i<quant; i++) {
            System.out.print("Product Name: ");
            String nomeProduto = teclado.nextLine();
            teclado.nextLine();

            System.out.println("------------------------");
        }


        teclado.close();
    }
}
