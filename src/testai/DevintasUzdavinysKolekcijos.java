package testai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
9.Faile surašyti žmonių vardai. Parašyti programą,
kuri juos nuskaitytų į sąrašą (ArrayList) ir iš ten juos atvaizduotų.

10.Faile surašyti žmonių vardai. Parašyti programą, kuri juos nuskaitytų į sąrašą (ArrayList) ir prieš atvaizduojant
leistų pasirinkti iš kokios raidės vardus rodyti. Užuomina: naudoti du Scanner klasės objektus,
vieną skaitymui iš failo, kitą iš klaviatūros.

11.Faile surašyti žmonių vardai. Parašyti programą, kuri juos nuskaitytų į sąrašą (ArrayList),
surūšiuotų pagal abėcėlę ir pavaizduotų ekrane.
 */

public class DevintasUzdavinysKolekcijos {
    private static final String Code_File_Name="files/vardai.txt";

    public static void main(String[] args) {

       try(BufferedReader bf = new BufferedReader(new FileReader(Code_File_Name))){
           List<String> vardai = new ArrayList<>();
           String line;
           while((line=bf.readLine())!=null){
              String[] items = line.split(" ");
              for(String m:items){
              vardai.add(m);

           }}
           System.out.println(vardai);
           System.out.println(vardai.size());
           for(int i=0; i< vardai.size(); i++){
          // System.out.println(vardai.sort(vardai));
           }
           Collections.sort(vardai);
           System.out.println("Po rikiavimo "+vardai);


           System.out.println("Iveskite raide kurios varda noretumete matyti");
           Scanner scanner = new Scanner(System.in);
           String a=scanner.nextLine().toUpperCase();
           for(String v:vardai) {
               if (a.equals(v.substring(0, 1))) {
                   System.out.println("Vardas is " + a + " raides yra " + v);
               } else {
                   System.out.println("vardo prasidedancio " + a + " raide nera");
                   break;
               }
//           Collections.sort(vardai, new Comparator<String>() {
//
//               public int compare(String o1, String o2) {
//                   return "s1".compareTo("s2");
//               }
//           });
           }
       }
       catch (IOException e){
           System.out.println("Blogas failas!!"+e);
       }
    }
}

/*
   String[] items = line.split(" ");
                if(items.length!=2){
                    throw new JACodeException("Koduote yra blogas");
                }
                codeMap.put(items[0],items[1]);
                valuesMap.put(items[1],items[0]);
 */