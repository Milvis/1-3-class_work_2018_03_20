import java.util.Scanner;

public class SecondTask {
    //konstatnta apsirasom

    private static final int MAX_NUMB = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //paprasyti vartotojo kiek skaiciu ivesti
        System.out.println("Iveskite kiek skaiciu noresite uzpildyti");

        int kiek = scanner.nextInt();

        int[] masyvas = new int[kiek];
        for (int i = 0; i < kiek; i++) {
            System.out.println("Iveskite " + i + "skaiciu");
            masyvas[i] = scanner.nextInt();
        }
        //masyvo isvedimas kvieciant metoda
        printMas(masyvas);

    }

    private static void printMas(int[] skMasyvas) {
        //klase Integer
        for (Integer sk : skMasyvas) {
            if (sk >= MAX_NUMB) {
                System.out.print(sk + " ");
            }
        }
    }
}
