package trabalho7_exceptions.aplication;

import trabalho7_exceptions.model.entites.Account;
import trabalho7_exceptions.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = teclado.nextInt();
        System.out.print("Holder: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.print("Initial balance: ");
        double iniBalan = teclado.nextDouble();
        System.out.print("Withdraw limit: ");
        double withLim = teclado.nextDouble();
        Account conta1 = new Account(number, holder, iniBalan, withLim);
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = teclado.nextDouble();
        try {
            conta1.withdraw(amount);
            System.out.print("Novo Saldo: " + String.format("%.2f", conta1.getBalance()));
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        teclado.close();
    }
}
