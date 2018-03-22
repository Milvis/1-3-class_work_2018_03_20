/*
Parašyti programą funkcijos f(x) reikšmei surasti:
a.   	 jei x teigiamas, tai f(x)=2x+8,
b.  	jei x neteigiamas, tai f(x)=21-7x

 */

import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Iveskite x reiksme");
        int x=sc.nextInt();
        int y=0;
        if(x>0){
            y=2*x+8;
        } else if(x<0){
            y=21-7*x;
        }
        System.out.println("Atsakymas f(x)="+y);
    }
}
