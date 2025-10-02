package Level1_3_Tasca_S1_03;

import java.util.*;

public class QuizGame {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, String> countriesMap;
    private String userName;
    private int score;

    public QuizGame (){
        countriesMap = FileManager.loadCountries("resources/countries.txt");
    }

    public void start(){
        if (countriesMap == null || countriesMap.isEmpty()){
            System.out.println("Countries file not found.");
            return;
        }

        askUserName();
        playGame();
        showScore();
        FileManager.saveScore("\"resources/clasification.txt\"", userName, score);
    }

    public void askUserName(){
        System.out.println("Please introduce your name : ");
        userName = scanner.nextLine().trim();
    }

    public void playGame(){
        List<String> countriesList = new ArrayList<>(countriesMap.keySet());
        Random randomCountry = new Random();
        final int QUESTIONS_LIMIT = 10;
        int score = 0;

        for (int i = 0; i < QUESTIONS_LIMIT; i++) {
            int randomIndex = randomCountry.nextInt(countriesList.size());
            String country = countriesList.get(randomIndex);
            String correctCapital = countriesMap.get(country);

            System.out.println("Write the capital of :" + country);
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(correctCapital)) {
                System.out.println("✅Correct answer!!✅");
                score++;
            } else {
                System.out.println("❌ Wrong answer, the correct answer was : " + correctCapital + "❌");

            }
        }
    }

    public void showScore(){
        System.out.println("\uD83C\uDFAF" + userName + " your total score was " + score + "/10");
    }
}
