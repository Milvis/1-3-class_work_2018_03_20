package penkta;


import com.sun.javafx.iio.ios.IosDescriptor;

import java.io.*;
import java.util.Map;
import java.util.Set;
//su alt+enter galima pridet import, ant Map jeigu pats neisideda

public class ReadCodeService {

    //kuriam konstanta konstantos pvz_su_tarpais
    private static final String Code_File_Name="files/koduote.txt";

    public void readFilePutToMaps(Map<Integer,String> codeMap, Map<String, Integer> valuesMap) throws JACodeException {

        //failo nuskaitymas //nuo java7 bufferreader dedamas i try () ir nereikia finally bloko uzdarineti failo //try with resorces
        try (BufferedReader bf = new BufferedReader(new FileReader(Code_File_Name))){ //ant lemputes surround try catch prideda kodo ir ner klaidos

            String line;
            while ((line=bf.readLine())!=null){ //tikrina ar pavyko nuskaityti eilute

                String[] items = line.split(" "); //atskiria per tarpa indexa ir raide
                //patikrinimas
                if(items.length!=2) {
                    throw new JACodeException("Koduote yra bloga");
                }
                    codeMap.put(Integer.valueOf(items[0]), items[1]); //sudeda indeksus ir raides
                    valuesMap.put(items[1], Integer.valueOf(items[0])); //sudeda raides ir indexus

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //metodas irasymui i faila//set netinka nes unikalios raides negali kartotis
public void writeDataIntoFile (Set<Integer> items){
   try ( BufferedWriter bw = new BufferedWriter(new FileWriter("files/uzkoduota.txt"))){
       for(Integer item:items){
           bw.write(item);
       }


   }catch (IOException e){

   }
}
}
