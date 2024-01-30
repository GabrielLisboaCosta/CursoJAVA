package trabalho1.aplication;

import trabalho1.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor do dólar?");
        double dolar = teclado.nextDouble();
        System.out.println("Quantos reais vai pagar?");
        double reais = teclado.nextDouble();

        double total = CurrencyConverter.converter(dolar, reais);

        System.out.printf("Total: %.2f%n", total);





        teclado.close();
    }
}
