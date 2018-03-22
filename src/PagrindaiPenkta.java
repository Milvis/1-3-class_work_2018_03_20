
/*
Antanas nusprendė nusipirkti naują automobilį ir jam svarbus rodiklis yra kuro sąnaudos.
Padėkite Antanui ir realizuoti programą, kuri apskaičiuotų kiek automobilis vidutiniškai
 sunaudoja kuro 100 km. Programa turi paprašyti Antano įvesti nuvažiuotus km ir kuro sąnaudas.
  Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo. Vidurkio skaičiavimas vykdomas kitame metode.
  Programa negali sustoti jei Antanas per klaidą įves tekstą, ji tu vėl prašyti pakartoti įvedimą.
  Programa baigia darbą kai vidurkis apskaičiuotas sėkmingai.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class PagrindaiPenkta {
    private static   Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Iveskite nuvaziuotus kilometrus: ");
        double km=getCorreectNumber();
        System.out.print("Iveskite kuro sanaudas: ");
        double sanaudos=getCorreectNumber();

        System.out.println("Vidutines automobilio sanaudos"+vidSanaudos(km,sanaudos));
    }


    //metodas nuskaitymui
    private static double getCorreectNumber() {
        double result = 0.0;

        while (true) {  //ciklas kad leistu pakartotinai ivesti po blogo bandymo
            try {
                result = sc.nextDouble();
                break;  //break po sekmingo nuskaitymo
            } catch (InputMismatchException e) {
                System.out.println("Blogas skacius bandykite ivesti dar karta:");
                sc.nextLine(); // perkeliam i kita eilute kad eitu toliau
            }
        }
        return result;
    }

    //metoas avg sanaudom rasti
    private  static double vidSanaudos(double km, double sanaudos){
        double vidurkis=0;
        vidurkis=(sanaudos*100)/km;
        return vidurkis;
    }


    //split string
    private static void splitString(){
        String test="as ir tu mes kartu";
        String[] items=test.split(" "); //atskiria String per tarpa i sudeda i masyva
        for(String t:items){
            System.out.println(t);
        }
    }
}
