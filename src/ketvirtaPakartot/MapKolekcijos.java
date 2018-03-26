package ketvirtaPakartot;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class MapKolekcijos {
    public static void main(String[] args) {

        Map<Integer,String> maxPvz = new HashMap<>();

        maxPvz.put(12,"Jonas");
        maxPvz.put(3,"Jonas");
        maxPvz.put(4,"Antanas");
        maxPvz.put(1,"Petras");
        maxPvz.put(12,"Jonas_pakartojam");

        for(Integer m:maxPvz.keySet()){
            System.out.println(" key: "+m+" values: "+maxPvz.get(m));
        }
    }
}
