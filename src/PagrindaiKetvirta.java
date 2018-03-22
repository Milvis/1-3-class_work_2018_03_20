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
    public static void main(String[] args) {
        int mase=0;
        int ugis=0;
try {
    Scanner sc = new Scanner(System.in);
    System.out.print("Iveskite mase:");
     mase = sc.nextInt();
    System.out.println("Iveskite ugi:");
     ugis = sc.nextInt();
} catch (InputMismatchException e){
    System.out.println("Blogai ivestas skaicius");
}

        System.out.println(kmiIdeksas(mase,ugis));
    }

    private static double kmiIdeksas(int svoris,int ugis){
        double kmi=svoris/ Math.pow(ugis,2);

         return kmi;
    }
}
