package trabalho6_abstract.aplication;

import trabalho6_abstract.entites.Fornecedor;
import trabalho6_abstract.entites.PessoaFisica;
import trabalho6_abstract.entites.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Fornecedor forn;
        List<Fornecedor> fornecedores = new ArrayList<>();

        System.out.print("Numeros de funcionários: ");
        int quant = teclado.nextInt();
        for(int i=1; i<=quant;i++){
            System.out.println("Tax payer #" +i+ " data: ");
            System.out.print("Individual or company (i/c)? ");
            char x = teclado.next().charAt(0);
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Anual income: ");
            double anualInc = teclado.nextDouble();
            if(x == 'i'){
                System.out.print("Health expenditures: ");
                double heExp = teclado.nextDouble();
                forn = new PessoaFisica(nome, anualInc, heExp);
                fornecedores.add(forn);
            }
            if(x == 'c'){
                System.out.print("Number of employees: ");
                int nroEmp = teclado.nextInt();
                forn = new PessoaJuridica(nome, anualInc, nroEmp);
                fornecedores.add(forn);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(Fornecedor fornecedor: fornecedores){
            System.out.printf(fornecedor.getNome() + ": $" + String.format("%.2f\n", fornecedor.getImposto()));
        }
        double total = 0;
        for(Fornecedor fornecedor: fornecedores){
            total += fornecedor.getImposto();
        }
        System.out.printf("TOTAL TAXES: $" + String.format("%.2f\n",total));
        teclado.close();
    }
}
