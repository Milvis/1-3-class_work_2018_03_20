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

public class PagrindaiTreciaKlasej {

    private static Scanner sc = new Scanner(System.in); //iskeliam i klase kad butu prieinamas metode!!!


    public static void main(String[] args) {

        meniu();
        String pasirinkimas = sc.nextLine();

        switch (pasirinkimas) {
            case "a":
                staciojoTrikampioPlotas();

                break;
            case "b":
                staciakampioPlotas();
                break;
            case "c":
                kvadratoPlotas();
                break;
            case "d":
                apskritimoPlotas();
                break;
            default:
                System.out.println("Nieko nera!!");
                break;
        }
    }


    //meniu metode
    private static void meniu() {
        System.out.println("Pasirinkite figura" +
                " kurios plota skaiciuosime:\na. Staciakampis trikampis" +
                "\nb. Staciakampis\nc. Kvadratas\nd. Apskritimas");
    }


    private static void staciojoTrikampioPlotas() {
        System.out.print("Iveskite krastines ilgi a: ");
        double a = sc.nextDouble();
        System.out.print("Iveskite krastines ilgi b: ");
        double b = sc.nextDouble();
        double plotas = (a * b) / 2;
        System.out.println("Staciojo trikampio plotas yra " + plotas);
        //System.out.printf("Staciojo trikampio plotas yra %d", plotas);
    }

    private static void staciakampioPlotas() {
        System.out.print("Iveskite krastines ilgi a: ");
        double a = sc.nextDouble();
        System.out.print("Iveskite krastines ilgi b: ");
        double b = sc.nextDouble();
        double plotas = a * b;
        System.out.println("Staciakampio plotas yra " + plotas);
    }

    private static void kvadratoPlotas() {
        System.out.print("Iveskite krastines ilgi a: ");
        double a = sc.nextDouble();
        double plotas = Math.pow(a, 2);
        System.out.println("Kvadrato plotas yra " + plotas);
    }

    private static void apskritimoPlotas() {
        System.out.print("Iveskite apskritimo spinduli r: ");
        double r = sc.nextDouble();
        double plotas = Math.PI * (Math.pow(r, 2));
        System.out.println("Apskritimo plotas yra: " + plotas);
    }
}
