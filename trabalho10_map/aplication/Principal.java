package trabalho10_map.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Map<String,Integer> votos = new TreeMap<>();

        String path = "C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\curso\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line!=null){
                String[] inVect = line.split(",");
                if(votos.containsKey(inVect[0])){
                    int valor = votos.get(inVect[0]);
                    votos.put(inVect[0], Integer.parseInt(inVect[1]) + valor);
                }else {
                    votos.put(inVect[0], Integer.parseInt(inVect[1]));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }

        for(String key:votos.keySet()){
            System.out.println(key + ": " + votos.get(key));
        }

    }
}
