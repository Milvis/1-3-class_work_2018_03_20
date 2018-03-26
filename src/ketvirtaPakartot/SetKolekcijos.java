package ketvirtaPakartot;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetKolekcijos {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(123);
        numbers.add(3);
        numbers.add(9);
        numbers.add(12);
        numbers.add(9);

        numbers.forEach(System.out::println);

        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Jonas", "Jonaitis"));

        persons.add(new Person("Andrius", "Dariulis"));
        Person p = new Person("Tadas", "Kalin");
        persons.add(p);

        persons.forEach(pp-> System.out.println("Vardas "+pp.getName()+" Pavarde "+pp.getSurname()));
    }
}
