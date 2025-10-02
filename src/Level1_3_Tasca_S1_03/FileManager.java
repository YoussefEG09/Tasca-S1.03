package Level1_3_Tasca_S1_03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    public static Map<String, String> loadCountries(String filePath) {
        Map<String, String> countriesMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;


                String[] parts = line.split("\\s+", 2);

                if (parts.length == 2) {
                    String countrie = parts[0].trim().replace("_", " ");
                    String capital = parts[1].trim().replace("_", " ");
                    countriesMap.put(countrie, capital);
                } else {
                    System.out.println("Wrong line format :" + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File not found : " + e.getMessage());
        }

        return countriesMap;
    }

    public static void saveScore(String filePath, String name, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String line = name + " : " + score + "/10";
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("File not found : " + e.getMessage());
        }
    }



















}
