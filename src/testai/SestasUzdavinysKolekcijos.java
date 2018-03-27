package testai;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/*
 Sukurti naują List kolekciją, ją užpildyti 10 įrašų. Ištrinti iš kolekcijos kas 2 įrašą.
  Naudojant while ciklą. Rezultatus atspausdinti ekrane.
 */
public class SestasUzdavinysKolekcijos {
    public static void main(String[] args) {
        List<String> kol = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        kol.add("pirmas"); //0
        kol.add("antras"); //
        kol.add("trecias");//2
        kol.add("ketvirtas"); //
        kol.add("penktas");//4
        kol.add("sestas"); //
        kol.add("septintas");//6
        kol.add("astuntas"); //
        kol.add("devintas");//8
        kol.add("desimtas"); //

//kas antra issimt is listo
            for (int i = kol.size(); i >=0; i--) {
               // i++;
                if (i % 2 != 0) {
                    kol.remove(i);
                }
            }


        for(String m:kol){
            System.out.print(m+" ");
        }
    }
}