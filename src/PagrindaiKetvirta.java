/*
Parašyti programą, kuri padėtu Jonukui apsiskaičiuoti savo kūno masės indeksą. Jonukas turi įvesti savo masę ir ūgį,
pagal gautus duomenis paskaičiuotų ir atvaizduotų jo kūno masės indeksą. KMI = masė (kg) / (ūgis(m))^2.
Jonuko duomenų nuskaitymas ir skaičiavimas vykdomi skirtinguose metoduose. Papildykite programa,
kad jei Jonukas įvestu ne skaičių programa pasakytu, kad blogai įvestas skaičius ir leistu pakartoti.
Programa baigtu darbą tik tada kai abu skaičiai įvesti gerai ir kmi apskaičiuotas.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PagrindaiKetvirta {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Iveskite mase:");
        double mase = getCorreectNumber(); //kvieciam metoda kuris patikrina ar ivestas skaicius
        System.out.println("Iveskite ugi:");
        double ugis =getCorreectNumber(); //kvieciam metoda kuris patikrina ar ivestas skaicius

        System.out.println(kmiIdeksas(mase, ugis));
    }

//metodas patikrinti ar ivestas skaicius ir jeigu ne, ismeta klaida ir vel leidzia ivesti skaiciu
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


    private static double kmiIdeksas(double svoris, double ugis) {
        double kmi = svoris / Math.pow(ugis, 2);
        return kmi;
    }
}
