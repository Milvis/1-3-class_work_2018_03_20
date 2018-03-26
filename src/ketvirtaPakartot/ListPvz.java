package ketvirtaPakartot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPvz {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        names.add("Petras");
        names.add("Tadas");
        names.add("Jonas");

        for (String name : names) {
            System.out.println(name);

        }

        System.out.println("Ar tuscias: "+names.isEmpty());
        System.out.println("Dydis "+names.size());

        numbers.add(5);
        numbers.add(4);
        numbers.add(8);
        numbers.add(4);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        numbers.forEach(System.out::print);
        System.out.println();
        names.forEach(a-> System.out.println("index "+names.indexOf(a)+" reiksme "+a));

    }
}
