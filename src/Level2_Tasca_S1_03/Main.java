package Level2_Tasca_S1_03;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("La Tagliatella" , 5));
        restaurants.add(new Restaurant("La Fonda" , 5));
        restaurants.add(new Restaurant("Ca La Yaya" , 3));
        restaurants.add(new Restaurant("La Tagliatella" , 5));
        restaurants.add(new Restaurant("Ca La Yaya" , 4));

        System.out.println(restaurants.toString());
    }
}
