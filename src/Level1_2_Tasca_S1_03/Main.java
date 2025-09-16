package Level1_2_Tasca_S1_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }


        System.out.println(numbers);

        /*List<Integer> numbers2 = new ArrayList<>();
        for (int i = 10; i >= 0; i--){
            numbers2.add(i);
        }

        System.out.println(numbers2);*/


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
