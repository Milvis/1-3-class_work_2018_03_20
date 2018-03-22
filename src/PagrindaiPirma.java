
/*
Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl paprašytų įvesti kitą žodį,
jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.
Patikrinkite ar įvestas žodžio ilgis yra lyginis ar ne tam panaudokite % operatoriu.
Jei žodis yra lyginis atspausdinkite “Įvestas žodis  {įvestas_žodis} yra lyginis” ir šalia kokio ilgio yra žodis.
Jei nelyginis “Įvestas žodis {įvestas_žodis} nelyginis” šalia jo ilgį.
Taip suskaičiuokite kiek tame žodyje yra “a” raidžių.

 */

import java.util.Scanner;

public class PagrindaiPirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zodis = null;
        int kiekA = 0;
        int zodzioIlgis = 0;
        do {
            System.out.print("Iveskite zodi: ");
            zodis = scanner.nextLine();
            System.out.println("Jus ivedete: " + zodis);
            zodzioIlgis = zodis.length();
            for (int i = 0; i < zodis.length(); i++) {

                if (zodis.charAt(i) == ('a')) {
                    kiekA++;
                }
            }
            if ((zodzioIlgis) % 2 == 0) {
                System.out.println("Zodis " + zodis + " yra lyginis" + " jo ilgis yra " + zodzioIlgis + " jame yra (" + kiekA + ") a raidziu.");

            } else {
                System.out.println("Zodis " + zodis + " yra nelyginis" + " jo ilgis yra " + zodzioIlgis + " jame yra (" + kiekA + ") a raidziu");
            }
            kiekA=0;
        } while (!zodis.equals("pabaiga"));

    }
}
