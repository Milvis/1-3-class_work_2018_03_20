package ketvirta;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPirma {
    public static void main(String[] args) {


        //list sukurimas
        ArrayList<String> names = new ArrayList<>();
        //arba kitokia kolekcija list //List yra interface
        List<Integer> numbers = new ArrayList<>();  //paprastesnis rekomentuoja

        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Petras");
        names.add(2,"jonas2");  //i antra index ides jonas2 kitus pastumia i viduri saraso ideda.

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Kiek: " + names.size());
        System.out.println("Ar tuscias sarasas: " + names.isEmpty());
        System.out.println("Pirma pagal index: " + names.get(1));

        numbers.add(7);
        numbers.add(11);
        numbers.add(11);
        numbers.add(5);

        //surusiuoti kolekcija list
        Collections.sort(numbers);

        //surusiuota apvercia
        Collections.reverse(numbers);

        numbers.forEach(System.out::println); //atspausdins list nuo java8

        names.forEach(a -> System.out.println("indexas " + names.indexOf(a) + " reiksme " + a));  //spausdinam kolekcija vardu su indexais
    }
}
