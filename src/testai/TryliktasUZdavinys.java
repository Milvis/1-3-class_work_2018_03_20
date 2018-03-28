package testai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
13.Faile kiekvienoje eilutėje surašytas žmogaus vardas ir amžius. Parašyti programą, kuri nuskaitytų duomenis į HashMap
tipo duomenų struktūrą, tuomet leistų vartotojui įvesti norimą vardą,
 ir jei šis buvo duomenų faile, atvaizduoti to žmogaus amžių.
 */
public class TryliktasUZdavinys {

    private static final String Code_File_Name = "files/vardai1.txt";

    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(new FileReader(Code_File_Name))) {
            Map<String, String> vard = new HashMap<>();
            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                vard.put(items[0], items[1]);
            }
            System.out.println("Duomenu faile esantys vardai: " + vard);
            System.out.print("Iveskite varda: ");
            Scanner scanner = new Scanner(System.in);
            String ivestasVardas = scanner.nextLine();
            int k=1;
            for (String m : vard.keySet()) {
//                System.out.println(vard.keySet());
//                System.out.println("m- "+vard.get(m));
//                System.out.println("vardas"+m);
                k++;
                if (m.equals(ivestasVardas)) {
                    System.out.println("Vardas " + m + " jo amzius yra " + vard.get(m));
                }
                else if(k>vard.size()){
                    System.out.println("Tokio vardo faile nera!");
                }
            }


            } catch(IOException e){
                System.out.println("Blogas failas!!!");
            }
        }
    }
