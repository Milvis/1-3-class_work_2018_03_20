package testai;

import ketvirta.Person;

import java.util.*;

/*
Sukurti objekto klasę, kuri saugotų informaciją apie Vartotoją (vardas, pavardė, amžius, miestas).
 Parašyti metodą, kuris iš duotų parametrų (vardas, pavardė, amžius, miestas) sukurtų objektą ir įdėtų jį kolekciją.
 Kolekcijos rezultatus atspausdinti ekrane.
 */
public class TreciasKolekcijos {


    public static void main(String[] args) {
       List<Vartotojas> vartotojas = sarasasVartotoju();
       // System.out.println(vartotojas);
     //   Collections.sort(vartotojas, sarasasVartotoju().sortByVardas;);



    }

    private static List<Vartotojas> sarasasVartotoju() {
        List<Vartotojas> vartotojas = new ArrayList<>();
        vartotojas.add(new Vartotojas("Petras", "Jonaitis", 15, "Kaunas"));
        vartotojas.add(new Vartotojas("Jonas", "Uzbalis", 54, "Varena"));
        vartotojas.add(new Vartotojas("Tadas", "Antanaitis", 71, "Taurage"));
        return vartotojas;
    }
        // ystem.out.println(vartotojas);
        // vartotojas.forEach(System.out::println); //atspausdins list nuo java8

//       Collections.sort(vartotojas,vartotojas.sort);
//        vartotojas.forEach(pp-> System.out.println("Vardas "+pp.vardas+" pavarde "+pp.pavarde+" amzius  "+pp.amzius+" miestas "+pp.miestas));


//  persons.forEach(pp -> System.out.println("Vardas " + pp.getName() + " pavarde " + pp.getSurname()));

}
