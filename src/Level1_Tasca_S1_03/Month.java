package Level1_Tasca_S1_03;

import java.util.*;

public class Month {
    private String name;

    public Month(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid month's name.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    static List<Month> createMonthList() {
        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        return months;
    }

    static Set<Month> convertToSet(List<Month> months) {
        return new HashSet<>(months);
    }

    static void printMonthsList(Collection<Month> months) {
        for (Month m : months) {
            System.out.println(m);
        }
    }

    static void printWithForLoop(List<Month> months) {
        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }
    }


    static void printWithIterator(Set<Month> months) {
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public String toString() {
        return name;
    }


}