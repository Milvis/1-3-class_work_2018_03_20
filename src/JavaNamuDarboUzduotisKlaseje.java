import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaNamuDarboUzduotisKlaseje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items;
        while (true) {

            System.out.println("Iveskite du skaicius ir veiksma tarp ju");
            String line = sc.nextLine();
            items = line.split(" ");
            if (items.length == 3) {
                if (items[1].equals("+") || items[1].equals("-"))
                    break;
            }
        }

        int a = getCorrectNumber(items[0], sc, false);  //pirmas skaicius ne antras todel false
        int b = getCorrectNumber(items[2], sc, true);  //antras skaicius true
        switch (items[1]) {
            case "+":
                sum(a, b);
                break;
            case "-":
                minus(a, b);
                break;
        }
    }

    private static int getCorrectNumber(String number, Scanner scanner, boolean isSeccondNumber) {
        int result = 0;

        try {
            result = Integer.valueOf(number);
            if (isSeccondNumber && result == 0) {
                throw new NumberFormatException();    //meta klaida kuria nurodom  jeigu antras sk=0 kad klaida keliautu
            }
        } catch (NumberFormatException e) {
            String numbPosision=isSeccondNumber ?"antra":"pirma";   //kuri skaiciu ivesti
            while (true) {
                System.out.println("Blogas skaicius, iveskite " + numbPosision+ " nauja skaiciu:");
                try {
                    result = scanner.nextInt();
                    if (isSeccondNumber && result != 0 || !isSeccondNumber) {  // tikrina ar antras =0
                        break;
                    }
                } catch (InputMismatchException ex) {
                    scanner.nextLine();
                }
            }
        }
        return result;
    }


    //metodai skaiciuot
    private static void sum(int numb, int numb2) {
        System.out.println("suma=" + (numb + numb2));
    }

    private static void minus(int numb, int numb2) {
        System.out.println("skirtumas=" + (numb - numb2));
    }
}
