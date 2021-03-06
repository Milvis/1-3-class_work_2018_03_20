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
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Skaiciuotuvas iveskite ka norite skaiciuoti:");
        String skaiciuotuvas = sc.nextLine();
        String[] masyvas = splitString(skaiciuotuvas);


        double sk1 = getCorrectDouble(sc,masyvas[0]);
        char zenklas = masyvas[1].charAt(0);
        double sk2 = getCorrectDouble(sc,masyvas[2]);
        switch (zenklas) {
            case '+':
                sudetis(sk1, sk2);
                break;
            case '-':
                skirtumas(sk1, sk2);
                break;
            case '/':
                dalyba(sk1, sk2);
                break;
            case '*':
                daugyba(sk1, sk2);
                break;
            case '^':
                kelimasLaipsniu(sk1, sk2);
                break;
            default:
                System.out.println("Netinkamas zenklas!!");
                break;
        }
    }


    //metodas nuskaitymui
    private static double getCorreectNumber(Scanner sc) {
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

    private static double getCorrectDouble(Scanner sc, String num){
        double result=0.0;
                try{
                    result=Double.valueOf(num);
                }catch (NumberFormatException e){
                    System.out.println("Blogai ivestas skaicius");
                    result=getCorreectNumber(sc);
                }
                return result;
    }

    //split string
    private static String[] splitString(String test) {

        String[] items = test.split(" "); //atskiria String per tarpa i sudeda i masyva
        return items;
//        for(String t:items){
////            System.out.println(t);
////        }
    }

    private static void sudetis(double a, double b) {
        double suma = a + b;
        System.out.println(a + "+" + b + "=" + suma);
    }

    private static void skirtumas(double a, double b) {
        double ats = a - b;
        System.out.println(a + "-" + b + "=" + ats);
    }

    private static void dalyba(double a, double b) {
        double ats = 0;
        if (b != 0) {
            ats = a / b;
            System.out.println(a + "/" + b + "=" + ats);
        } else {
            System.out.println("Dalyba is 0 negalima !!!");
        }
    }

    private static void daugyba(double a, double b) {
        double ats = a * b;
        System.out.println(a + "*" + b + "=" + ats);
    }

    private static void kelimasLaipsniu(double a, double b) {
        double ats = Math.pow(a, b);
        System.out.println(a + "^" + b + "=" + ats);
    }

}
