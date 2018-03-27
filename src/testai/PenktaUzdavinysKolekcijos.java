package testai;

/*
Parašyti programą, kuri atspausdintų visas savaitės dienas vartotojui įvedus skaičių pvz 2 atspausdintų antradienis.
Panaudokite Enum klasę. Joje sukurti metodus kurie : grąžintų visas savaites dienas naudokite EnumSet<E>,
iš paimto skaičiaus atpažinti, kuri diena ir grąžintų jos pavadinimą. Rezultatus spausdinti ekrane.
 */

import java.util.EnumSet;
import java.util.Scanner;

public class PenktaUzdavinysKolekcijos {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int sk = scanner.nextInt();

        int temp1 = weekDay.PIRMADIENIS.getNumb();
        int temp2 = weekDay.ANTRADIENIS.getNumb();
        int temp3 = weekDay.TRECIADIENIS.getNumb();
        int temp4 = weekDay.KETVIRTADIENIS.getNumb();
        int temp5 = weekDay.PENKTADIENIS.getNumb();
        int temp6 = weekDay.SESTADIENIS.getNumb();
        int temp7 = weekDay.SEKMADIENIS.getNumb();

        //  EnumSet<weekDay> t=EnumSet;

        //   for (weekDay w :weekDay.values())


    }

    enum weekDay {
        PIRMADIENIS(1, ""), ANTRADIENIS(2, ""), TRECIADIENIS(3, ""), KETVIRTADIENIS(4, ""), PENKTADIENIS(5, ""),
        SESTADIENIS(6, ""), SEKMADIENIS(7, "");

        private int numb;

        private weekDay(int numb, String b) {
            this.numb = numb;
        }

        public int getNumb() {
            return numb;
        }

    }

}
