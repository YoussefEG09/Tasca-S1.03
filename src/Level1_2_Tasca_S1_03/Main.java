package Level1_2_Tasca_S1_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }


        System.out.println(numbers);

        List<Integer> numbers2 = new ArrayList<>();

        ListIterator<Integer> iterator = numbers.listIterator(numbers.size());

        while (iterator.hasPrevious()) {
            Integer integer = iterator.previous();
            numbers2.add(integer);

        }

        System.out.println(numbers2);
    }
}

