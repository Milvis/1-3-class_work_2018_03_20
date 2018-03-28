package testai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
12.Faile surašyti žmonių vardai, nuskaityti failą surašyti tik unikalius vardus į HashSet kolekciją
ir atspausdinti vardus, kurie baigėsi „as“
 */

public class DvyliktasUzdavinys {

    private static final String Code_File_Name="files/vardai.txt";

    public static void main(String[] args) {

        try(BufferedReader bf = new BufferedReader(new FileReader(Code_File_Name))){
            Set vard = new HashSet();
            String line;
            while ((line=bf.readLine())!=null){
                String[] items = line.split(" ");
                for(String s:items){
                    vard.add(s); //hashset tik unikalius vardus tures tad galima visus sudeti
                }
            }
            System.out.println(vard);
            //convert HAshSet to ArrayList kad galetume atrinkti vardus pagal "as"
            List<String> list = new ArrayList<String>(vard);
          //  String as=list.toString();

            for(String o:list){
                String pab=o.substring(o.length()-2);
              //  System.out.println(o.substring(o.length()-2));
                if(pab.equals("as")){
                    System.out.println("vardas kuris baigiasi <as> : "+o);
                }
            }
        //    System.out.println(as);
         //   System.out.println("Vardai kurie baigiasi <as>: "+vard.("as"));

        } catch (IOException e){
            System.out.println("Blogas failas!!!");
        }
    }
}
