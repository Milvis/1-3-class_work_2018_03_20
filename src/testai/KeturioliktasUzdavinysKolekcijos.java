package testai;

/*
Faile kiekvienoje eilutėje surašytas žmogaus vardas ir jo mėgstama spalva. Parašyti programą,
 kuri nuskaitytų duomenis į HashMap tipo duomenų struktūrą, tuomet leistų vartotojui įvesti norimą vardą,
 ir jei šis buvo duomenų faile, atvaizduoti to žmogaus mėgstamą spalvą.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KeturioliktasUzdavinysKolekcijos {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW="\u001B[33m";
    public static final String ANSI_BLACK="\u001B[30m";
    public static final String ANSI_RED="\u001B[31m";
    public static final String ANSI_BLUE="\u001B[34m";


    private static final String Code_File_Name = "files/vardai_spalvos.txt";

    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(new FileReader(Code_File_Name))) {
            Map<String, String> vard = new HashMap<>();
            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                vard.put(items[0], items[1]);
            }
            System.out.println("Duomenu faile esantys vardai: " + vard.keySet());
            System.out.print("Iveskite varda: ");
            Scanner scanner = new Scanner(System.in);
            String ivestasVardas = scanner.nextLine();
            int k=1;
            for (String m : vard.keySet()) {
                k++;
                if (m.equals(ivestasVardas)) {
                    System.out.println("Vardas " + m + " jo megstama spalva yra ");
                    String spalvint = vard.get(m); //pasiimam spalva
                    spalva(spalvint); //panaudojam spalva nuspalvint
                    break;
                    }
                    else if(k>vard.size()){
                        System.out.println("Tokio vardo faile nera!");
                    }
                }

        } catch (IOException e) {
            System.out.println("Blogas failas!!!");
        }
    }

    private static void spalva(String kol) {
        switch (kol) {
            case "zalia":
                System.out.println(ANSI_GREEN+"ŽALIA");
                break;
                case "geltona":
                    System.out.println(ANSI_YELLOW+"GELTONA");
                    break;
            case "juoda":
                System.out.println(ANSI_BLACK+"JUODA");
                break;
            case "raudona":
                System.out.println(ANSI_RED+"RAUDONA");
                break;
            case "melyna":
                System.out.println(ANSI_BLUE+"MELYNA");
                break;
                default:
                    System.out.println("Nera tokios spalvos!!!");
                    break;
        }
    }
}
