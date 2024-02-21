package trabalho8_arquivos.aplication;

import trabalho8_arquivos.entites.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        List<Produto> todosProd = new ArrayList<>();
        String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\curso\\prod.txt";
        System.out.println();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] prodVect = line.split(",");
                Produto prod = new Produto(prodVect[0], Double.parseDouble(prodVect[1]), Integer.parseInt(prodVect[2]));
                todosProd.add(prod);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        String pasta = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\curso";
        boolean suc = new File(pasta + "\\newPacth").mkdir();




        String pathNovo = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\curso\\newPacth\\novosProd.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathNovo))){
            for(Produto produtin : todosProd){
                String line = (produtin.getNome() + "," + String.format("%.2f",produtin.getTotalPrice()));
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader(pathNovo))){
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
