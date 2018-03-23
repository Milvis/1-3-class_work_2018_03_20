package ketvirta;

import java.util.ArrayList;

/*
Sukurti naują ArrayList kolekciją, pridėti 5 vartotojų vardus ir juos atspausdinti,
jei vardo ilgis ilgesnis nei 6 simboliai. Rezultatus spausdinti ekrane naudojant for ciklą.
 */
public class PirmaUzduotis {
    public static void main(String[] args) {
        ArrayList<String> vardai=new ArrayList<>();
        vardai.add("Petras");
        vardai.add("Antanas");
        vardai.add("Jonas");
        vardai.add("Kostas");
        vardai.add("Povilas");
        for(String n:vardai){
            if(n.length()>6)
        System.out.println(n);}

        System.out.println("Pirmas list elementas yra: "+pirmasElementas(vardai));
        System.out.println("Paskutinis list elementas yra: "+paskutinisElementas(vardai));

    }

    /*
    Naudojant sukurtą kolekciją parašyti du metodus.
    Pirmas grąžina pirmą list`o elementą, o antras metodas paskutinį. Rezultatus spausdinti ekrane.
     */
    private static String pirmasElementas(ArrayList<String> sarasas){
        String pirmas=sarasas.get(0);
        return pirmas;
    }

    private static String paskutinisElementas(ArrayList<String> sarasas){
        String paskutinis= sarasas.get(sarasas.size()-1); //paskutini elementa paims size-1
        return paskutinis;
    }
}
