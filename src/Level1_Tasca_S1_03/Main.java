package Level1_Tasca_S1_03;

import java.util.*;

import static Level1_Tasca_S1_03.Month.*;


public class Main {
    public static void main(String[] args) {
        List<Month> months = createMonthList();



        System.out.println("===== Months list without August =====");
        printMonthsList(months);

        months.add(7, new Month ("August"));

        months.add(new Month("February"));

        Set<Month> monthSet = convertToSet(months);



        System.out.println("===== Months list with August and HashSet without duplicates =====");
        printMonthsList(monthSet);


        System.out.println("\n===== Running the ArrayList with clasic For =====");
        printWithForLoop(months);

        System.out.println("\n===== Running the HashSet with Iterator =====");
        printWithIterator(monthSet);

    }
}
