import java.util.InputMismatchException;
import java.util.Scanner;

/*
Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
a.       Sumos
b.      Skirtumo
c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
d.      Daugybos
e.       Kėlimas laipsniu
Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje. Onutei negalima leisti įvesti blogą skaičių
ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
 Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.

 */
public class PagrindaiSesta {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Skaiciuotuvas iveskite ka norite skaiciuoti:");
        String skaiciuotuvas=sc.nextLine();
        String[] masyvas=splitString(skaiciuotuvas);
        for (int i=0; i<masyvas.length;i++){
            
        }

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

    //split string
    private static String[] splitString(String test){

        String[] items=test.split(" "); //atskiria String per tarpa i sudeda i masyva
        return items;
//        for(String t:items){
////            System.out.println(t);
////        }
    }


}
