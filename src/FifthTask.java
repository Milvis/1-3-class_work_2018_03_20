/*
5. Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.
Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.
 */

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kiek=5;
        String[] mas=new String[kiek];
        for(int i=0; i<mas.length; i++){
            System.out.println("Iveskite zodi " + i);
            mas[i]=scanner.nextLine();
        }
        System.out.print("Ivesti zodziai:");
    for (String m:mas){
        System.out.print(m +" ");
    }

    }
}
