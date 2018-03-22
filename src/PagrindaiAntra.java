/*
Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai.
Jam sunku pačiam tai padaryti todėl jis prašo Jūsų pagalbos. Parašykite metodą kuris patikrintų ar duotas žodis
yra polindromas (žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar sakinys,
pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”). Užuomina: pašalinti tarpus ir tuomet
keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa raidės.
 */


import java.util.Scanner;

public class PagrindaiAntra {
    public static void main(String[] args) {
        Scanner skaitymas = new Scanner(System.in);
        System.out.println("Iveskite sakini arba zodi");
        String zodis = skaitymas.nextLine();
        String sakinys = zodis.toLowerCase().replaceAll("\\s", ""); //mazosios raides ir be tarpu
        System.out.println("sakinys be tarpu: " + sakinys);
        int a = 0;
        int b = sakinys.length() - 1;
        int c = 0;
        for (int i = 0; i < sakinys.length() / 2; i++) {
            if (sakinys.charAt(a) == sakinys.charAt(b)) {
                a++;
                b--;
                c++;
            }
        }
        if (c >= (sakinys.length() / 2)) {
            System.out.println("Zodis yra polindromas");
        } else {
            System.out.println("Nera polindromas");
        }
    }
}
