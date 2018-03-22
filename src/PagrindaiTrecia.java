/*
Parašykite programą kuri padėtu moksleiviui atlikti matematikos darbus. Jam reikia apskaičiuoti figūrų plotus.
Visi plotai skaičiuojami atskiruose metoduose. Moksleivis įveda rodmenys
naudodamas konsolę (Scanner sc = new Scanner(System.in)). Moksleivis gali pasirinkti kokios figūros plotą skaičiuos.
Po to sistema paprašo įvesti matmenys reikalingus tos figūros ploto skaičiavimui.
a.   	Apskaičiuotu stačiojo trikampio plotą. Formulė rezultatas = (a*b)/2;
b.  	Stačiakampio plotas, formulė rezultatas =a*b.
c.   	Kvadrato plotas, rezultatas = a^2
d.  	Apskritimo plotas, Formulė rezultatas = pi*(a^2). Pi = 3.1415

 */

import java.util.Scanner;

public class PagrindaiTrecia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite norima figura(statusis trikampis, staciakampis, kvadratas arba apskritimas):");
        String nuskaitomaFigura = scan.nextLine();
        if (nuskaitomaFigura.equals("statusis trikampis")) {
            System.out.print("Iveskite staciojo trikampio krastines ilgi a: ");
            int a = scan.nextInt();
            System.out.print("Iveskite staciojo trikampio krastines ilgi b: ");
            int b = scan.nextInt();
            System.out.println("Staciakampio trikampio plotas yra " + staciakampioPlotas(a, b));
        } else if (nuskaitomaFigura.equals("staciakampis")) {
            System.out.print("Iveskite staciakampio krastines ilgi a: ");
            int a = scan.nextInt();
            System.out.print("Iveskite staciakampio krastines ilgi b: ");
            int b = scan.nextInt();
            System.out.println("Staciakampio plotas yra " + staciakampioPlotas(a, b));
        } else if (nuskaitomaFigura.equals("kvadratas")) {
            System.out.print("Iveskite kvadrato krastines ilgi a: ");
            int a = scan.nextInt();
            System.out.println("Kvadrato plotas yra " + kvadratoPlotas(a));
        } else if (nuskaitomaFigura.equals("apskritimas")) {
            System.out.print("Iveskite apskritimo spindulio ilgi r: ");
            int r = scan.nextInt();
            System.out.println("Apskritimo plotas yra " + apskritimoPlotas(r));
        } else {
            System.out.println("Neteisingas pasirinkimas, programa baigia darba!!!");
        }

    }


    private static int staciojoTrikampioPlotas(int a, int b) {
        int plotas = (a * b) / 2;
        return plotas;
    }

    private static int staciakampioPlotas(int a, int b) {
        int plotas = a * b;
        return plotas;
    }

    private static double kvadratoPlotas(int a) {
        double plotas = Math.pow(a, 2);
        return plotas;
    }

    private static double apskritimoPlotas(int a) {
        double plotas = Math.PI * Math.pow(a, 2);
        return plotas;
    }
}
