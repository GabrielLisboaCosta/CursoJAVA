package trabalho3_list.aplication;

import trabalho3_list.util.ListaConta;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        ListaConta func = new ListaConta();

        System.out.print("Quantidade de funcionários: ");
        int quant = teclado.nextInt();

        for(int i=0; i<quant; i++){
            System.out.println("Funcionário " + (i+1));
            System.out.print("Id: ");
            int id = teclado.nextInt();
            for (ListaConta listaGeral: func.getListaGeral()) {
                if(id == listaGeral.getId()){
                    System.out.println("ID ja existente, digite outro!");
                    System.out.print("Id: ");
                    id = teclado.nextInt();
                    break;
                }
            }
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Salário: ");
            double salario = teclado.nextDouble();
            ListaConta novoFunc = new ListaConta(id, nome, salario);
            System.out.println("--------------------------------------");
        }
        for (ListaConta listaGeral: func.getListaGeral()) {
            System.out.println(listaGeral);
        }
        System.out.println("Deseja realizar um aumento salarial? (s/n)");
        char resposta = teclado.next().charAt(0);
        if(resposta == 's') {
            System.out.print("ID: ");
            int idTroca = teclado.nextInt();

            boolean contem = false;
            for (ListaConta listaGeral : func.getListaGeral()) {
                if (listaGeral.getId() == idTroca) {
                    contem = true;
                    break;
                }
            }
            if (contem) {
                System.out.print("Porcentagem de aumento: ");
                double porcAum = teclado.nextDouble();

                for (ListaConta listaGeral : func.getListaGeral()) {
                    if (listaGeral.getId() == idTroca) {
                        listaGeral.aumento(porcAum);
                    }
                }
                for (ListaConta listaGeral : func.getListaGeral()) {
                    System.out.println(listaGeral);
                }
            }else{
                System.out.println("ID inexistente!");
            }
        }
    }
}
