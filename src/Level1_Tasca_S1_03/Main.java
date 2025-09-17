package Level1_Tasca_S1_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();



        months.add(new Month("January")) ;
        months.add(new Month("February")) ;
        months.add(new Month("March")) ;
        months.add(new Month("April")) ;
        months.add(new Month("May")) ;
        months.add(new Month("June")) ;
        months.add(new Month("July")) ;
        Month August = new Month("August");
        months.add(new Month("September")) ;
        months.add(new Month("October")) ;
        months.add(new Month("November")) ;
        months.add(new Month("December")) ;

        System.out.println("===== Months list without August =====");
        System.out.println(months);

        months.add(7, August);

        months.add(new Month("February"));

        HashSet<Month> monthSet = new HashSet<>(months);



        System.out.println("===== Months list with August and HashSet without duplicates =====");
        System.out.println(monthSet);


        System.out.println("\n===== Running the ArrayList with clasic For =====");
        for (int i = 0; i < months.size(); i++){
            System.out.println(months.get(i));
        }

        System.out.println("\n===== Running the HashSet with Iterator =====");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
