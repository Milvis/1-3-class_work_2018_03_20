package ketvirta;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {

        //three klase
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(123);
        numbers.add(3);
        numbers.add(9);
        numbers.add(12);
        numbers.add(9);
        //isvedimas irasu, bus surikiuoti ir nera pasikartojimu
        numbers.forEach(System.out::println);

//kitas set kuris saugos objekta ne viena irasa
        Set<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Andrius", "Baltrunas")); //pries dedant i sarasa sukuria objekta
        // arba
        Person p = new Person("Tomas", "Jonaitis");
        persons.add(p);
        persons.add(new Person("Andrius", "Baltrunas"));

        //atspausdinam

        persons.forEach(pp -> System.out.println("Vardas " + pp.getName() + " pavarde " + pp.getSurname()));

        //   names.forEach(a -> System.out.println("indexas " + names.indexOf(a) + " reiksme " + a));
    }


}
