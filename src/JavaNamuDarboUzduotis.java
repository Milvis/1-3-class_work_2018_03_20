import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaNamuDarboUzduotis {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Skaiciuotuvas iveskite ka norite skaiciuoti:");
        String skaiciuotuvas = sc.nextLine();
        //sudedam i masyva duomenis atskirtus per tarpa
        String[] masyvas = skaiciuotuvas.split(" ");
        if (masyvas.length == 3) {
            skaiciuotuvoMenu(masyvas);
        } else {
            System.out.println("Per daug ivestu duomenu arba blogas formatas");
        }

    }

    //metodas pakartotiniam nuskaitymui jeigu pirmu atveju blogas skaicius
    private static double getGoodDouble(Scanner sc) {
        double numeris = 0.0;
        while (true) {
            try {
                numeris = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
                sc.nextLine();
            }
        }
        return numeris;
    }

    //metodas patikrinti ar ivestas teisingas skaicius
    private static double getCorreectNumber(Scanner sc, String numeris) {
        double result = 0.0;

        try {
            result = Double.valueOf(numeris);
        } catch (NumberFormatException e) {
            System.out.println("Blogas skaicius bandykite skaiciu ivesti dar karta:");
            result = getGoodDouble(sc);
        }
        return result;
    }

    //meniu skaiciavimo parinkimui
    private static void skaiciuotuvoMenu(String[] masyvas) {
        double sk1 = getCorreectNumber(sc, masyvas[0]);
        char zenklas = masyvas[1].charAt(0);
        double sk2 = getCorreectNumber(sc, masyvas[2]);
        //patikrinsim ar antras skaicius 0, jeigu 0 prasom ivesti skaiciu is naujo
        if (sk2 == 0) {
            System.out.println("Ivedete 0, iveskite kita skaiciu ne 0");
            sk2 = getGoodDouble(sc);
        }
        switch (zenklas) {
            case '+':
                sudetis(sk1, sk2);
                break;
            case '-':
                skirtumas(sk1, sk2);
                break;
            default:
                System.out.println("Netinkamas veiksmas, ši programa moka tik sudėti arba atimti!!");
                break;
        }
    }

    //metodas sudeti
    private static void sudetis(double a, double b) {
        double suma = a + b;
        System.out.println(a + "+" + b + "=" + suma);
    }

    //metodas atimti
    private static void skirtumas(double a, double b) {
        double ats = a - b;
        System.out.println(a + "-" + b + "=" + ats);
    }
}
