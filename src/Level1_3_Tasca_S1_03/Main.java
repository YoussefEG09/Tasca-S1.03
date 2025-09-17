package Level1_3_Tasca_S1_03;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String countries = "C:\\Users\\formacio\\Desktop\\Youssef\\Tasca-S1.03\\countries.txt";

        HashMap<String, String> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(countries))) {
            String line;

            while ((line = reader.readLine()) != null) {


                //Separa el pais de la capital
                String[] parts = line.split("\\s+", 2); //divide maximo en 2 partes

                if (line.isEmpty()) {
                    continue;
                }

                if (parts.length == 2) {
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
        System.out.println("Please introduce your name : ");
        String name = scanner.next();


        List<String> countriesList = new ArrayList<>(map.keySet());
        Random randomCountry = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int randomIndex = randomCountry.nextInt(countriesList.size());
            String country = countriesList.get(randomIndex);
            String correctCapital = map.get(country);

            System.out.println("Write the capital of :" + country);
            String answer = scanner.next().trim();

            if (answer.equalsIgnoreCase(correctCapital)) {
                System.out.println("✅Correct answer!!✅");
                score++;
            } else {
                System.out.println("❌ Wrong answer, the correct answer was : " + correctCapital + "❌");

            }

        }
        System.out.println("\uD83C\uDFAF" + name + " your total score was " + score + "/10");


        String clasification = "C:\\Users\\formacio\\Desktop\\Youssef\\Tasca-S1.03\\clasification.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(clasification , true))){
            String line2 = name + " : " + score + "/10";
            writer.write(line2);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("File not found : " + e.getMessage());
        }
    }
}
