package testai;
/*
Sukurti naują List kolekciją, pridėti 10 naujų įrašų.
Padalinti kolekciją į dvi kolekcijas, abi jas atspausdinti ekrane.
 */

import java.util.ArrayList;
import java.util.List;

public class AstuntasUzdavinysKolekcijos {
    public static void main(String[] args) {
        List<Integer> kol = new ArrayList<>();
        kol.add(4);
        kol.add(5);
        kol.add(6);
        kol.add(4);
        kol.add(9);

        kol.add(1);
        kol.add(55);
        kol.add(6);
        kol.add(2);
        kol.add(12);


        List<Integer> a = kol.subList(0, (kol.size()) / 2);
        List<Integer> b = kol.subList(kol.size() / 2, kol.size());
        for (Integer m : a) {
            System.out.println("masyvas a: " + m);
        }
        for (Integer m : b) {
            System.out.println("masyvas b: " + m);
        }
    }
}
