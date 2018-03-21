import java.util.Scanner;

/*
Parašyti programą, kuri paprašytų įvesti 5 skaičius.
Baigus skaičių įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.
 */
public class FourthTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kiek = 5;
        int[] mas = new int[kiek];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite skaiciu "+i);
            mas[i] = scanner.nextInt();
        }

        System.out.println("Ivestu skaiciu suma= " + suma(mas));
        System.out.print("Masyvo elementai: ");
        for (Integer a : mas) {
            System.out.print( a + " ");
        }
    }

    private static int suma(int[] mas) {
        int suma = 0;
        for (Integer m : mas) {
            suma += m;
        }
        return suma;
    }
}
