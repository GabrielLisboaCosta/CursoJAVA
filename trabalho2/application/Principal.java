package trabalho2.application;

import trabalho2.util.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.print("Número da Conta: ");
        int nroConta = teclado.nextInt();
        System.out.print("Nome titular: ");
        teclado.nextLine();
        String nomeTitular = teclado.nextLine();
        System.out.print("Depósito inicial (s/n)? ");
        String opcDeposito = teclado.next();

        if(opcDeposito.equals("s")){
            System.out.print("Digite o valor: ");
            double depInicial = teclado.nextDouble();
            conta1 = new ContaBancaria(nroConta, nomeTitular, depInicial);
        } else if (opcDeposito.equals("n")) {
            conta1 = new ContaBancaria(nroConta, nomeTitular);
        }
        System.out.println(conta1);

        System.out.print("Digite o valor de depósito: ");
        double deposito = teclado.nextDouble();
        conta1.deposito(deposito);
        System.out.println(conta1);

        System.out.print("Digite o valor de Saque: ");
        double saque = teclado.nextDouble();
        conta1.saque(saque);
        System.out.println(conta1);

        teclado.close();
    }
}
