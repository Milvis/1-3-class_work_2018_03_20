import java.util.Scanner;

/**
 * Parašyti programą, kuri leistų vartotojui įvesti norimą skaičių
 * ir po to parašytų ar šis skaičius yra lyginis, ar nelyginis. Užuomina panaudokite % operatoriu.
 */

public class FirstTask {

    public static void main(String[] args) {
        //scanner is utils klases

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int num = sc.nextInt();
        //ctrl+alt+l suformatuoja koda
        if (num % 2 == 0) {
            System.out.println(num + " yra lyginis");
        } else {
            System.out.println(num + " yra nelyginis");
        }
    }
}
