package testai;

import java.util.LinkedList;

/*
Sukurti naują metodą, kuris sukuria LinkedList kolekciją pridėti 5 vardus.
 Įterpti naują įrašą kolekcijos pradžioje ir pabaigoje.
 */
public class SeptintasUzdavinysKolekcijos {
    public static void main(String[] args) {
            kolekcija("Mil","Vis");

    }
    private static void kolekcija(String a, String b){
        LinkedList<String> kol=new LinkedList<>();
        kol.add("Antanas");
        kol.add("Jonas");
        kol.add("Petras");
        kol.add("Stasys");
        kol.add("Kazimieras");
        kol.addFirst(a);
        kol.addLast(b);

        for(String m:kol){
            System.out.println(m+" ");
        }


    }
}
