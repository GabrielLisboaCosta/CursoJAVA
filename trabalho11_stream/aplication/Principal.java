package trabalho11_stream.aplication;

import trabalho11_stream.entites.Empp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Empp> todosEmp = new ArrayList<>();
        String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\curso\\inn.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] prodVect = line.split(",");
                Empp emp = new Empp(prodVect[0], prodVect[1], Double.parseDouble(prodVect[2]));
                todosEmp.add(emp);
                line = br.readLine();
            }
            Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            List<String> emails = todosEmp.stream()
                    .filter(s -> s.getSalario() > salary)
                    .map(Empp::getEmail)
                    .sorted(comp)
                    .toList();
            emails.forEach(System.out::println);

            double sum = todosEmp.stream()
                    .filter(s -> s.getNome().charAt(0) == 'M')
                    .map(Empp::getSalario)
                    .reduce(0.0, (x,y) -> x + y);
            System.out.println("Soma dos salarios das pessoas cujos nomes começam com 'M': R$" + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
