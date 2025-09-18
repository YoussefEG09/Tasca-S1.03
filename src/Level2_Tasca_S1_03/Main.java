package Level2_Tasca_S1_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Bagliatella" , 5));
        restaurants.add(new Restaurant("La Fonda" , 5));
        restaurants.add(new Restaurant("a La Yaya" , 3));
        restaurants.add(new Restaurant("La Tagliatella" , 5));
        restaurants.add(new Restaurant("Ca La Yaya" , 4));

        System.out.println("================= HASHSET PRINTED ==================");
        System.out.println(restaurants.toString());

        List<Restaurant> sortedList = new ArrayList<>(restaurants);
        sortedList.sort(
                Comparator.comparing((Restaurant r) -> r.getName().trim().toLowerCase())
                        .thenComparing(Comparator.comparing(Restaurant::getScore).reversed()));


        System.out.println("============= SORTED LIST =================");

        for (Restaurant r : sortedList){
            System.out.println(r);
        }

    }

}
