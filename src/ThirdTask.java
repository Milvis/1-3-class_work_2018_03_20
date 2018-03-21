
/*
3. Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje turi būti atvaizduojama
įvestų skaičių suma. Skaičiavimas turi būti atliekamas kitame metode. Papildykite programą kuri neleistu įvesti
ne skaičius, jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.

//
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //kuriam scanner objekta kadnuskaityt is konsoles
        int sk=0; //susikuriam pries cikla kad butu prieinamas visada
        int kiek = 0; //kad zinoti masyvo ilgi
        int[] mas = {}; //tuscias masyvas pradziai
        do {
            System.out.println("Iveskite skaiciu kol bus ivestas ne 0 ");

            //ctrl galima paziuret aprasyma
            try {
                sk = scanner.nextInt();
                if (mas.length <= kiek) {
                    mas = Arrays.copyOf(mas, mas.length + 1);  //masyva pailginam
                }
                mas[kiek++] = sk; //idedam skaiciu i masyva

            } catch (InputMismatchException e){
                System.out.println("Blogai ivestas skaicius, programa baigia darba");
           //     scanner.nextLine(); //nuskaityti per nauja kad nesisuktu be galo o toliau lieptu ivesti skaiciu
            sk=0; //jeigu norim sustabdyti programa sk=0 ir sustoja
            }

        } while (sk != 0);

        System.out.println("Suma yra: " + masSuma(mas));

    }

    private static int masSuma(int[] mas) {
        int sum = 0;
        for (Integer m : mas) {
            sum += m;
        }
        return sum;
    }
}
