package trabalho5_polimorfismo.aplication;
import trabalho5_polimorfismo.entites.ImportedProduct;
import trabalho5_polimorfismo.entites.Product;
import trabalho5_polimorfismo.entites.UsedProduct;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Product prod = new Product();

        System.out.print("Número de produtos: ");
        int quant = teclado.nextInt();
        for(int i=1; i<=quant;i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Comum, usado ou importado (c/u/i)?");
            char escolha = teclado.next().charAt(0);
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Preço: ");
            double price = teclado.nextDouble();
            if(escolha == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                teclado.nextLine();
                String data = teclado.nextLine();
                prod.getProductList().add(new UsedProduct(nome, price, data));
            }
            if(escolha == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = teclado.nextDouble();
                prod.getProductList().add(new ImportedProduct(nome, price, customsFee));
            }
            if(escolha == 'c'){
                prod.getProductList().add(new Product(nome, price));
            }
        }
        for(Product produtos : prod.getProductList()){
            produtos.priceTag();
        }




        teclado.close();
    }
}