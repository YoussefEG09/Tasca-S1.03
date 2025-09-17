package Level1_3_Tasca_S1_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String countries = "C:\\Users\\formacio\\Desktop\\Youssef\\Tasca-S1.03\\countries.txt";

        HashMap<String , String> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(countries))){
            String line;

            while ((line = reader.readLine()) != null) {


                //Separa el pais de la capital
                String[] parts = line.split("\\s+" , 2); //divide maximo en 2 partes

                if (line.isEmpty()){
                    continue;
                }

                if (parts.length ==2) {
                    String country = parts[0].trim().replace("_", " ");
                    String capital = parts[1].trim().replace("_", " ");
                    map.put(country, capital);
                } else {
                    System.out.println("Wrong line format : " + line);
                }

            }

        } catch (IOException e) {
            System.out.println("File not found : " + e.getMessage());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your name : " );
        String name = scanner.next();;

        List<String> countriesList = new ArrayList<>(map.keySet());
        Random randomCountry = new Random();
        int score = 0;








    }
}
