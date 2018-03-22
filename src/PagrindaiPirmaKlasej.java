import java.util.Scanner;

public class PagrindaiPirmaKlasej {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("Iveskite zodi, jei norite baigti iveskite pabaiga");
            String word=scan.nextLine();

            if(word.toLowerCase().equals("pabaiga")){
                break;}

            if(word.length()%2==0){
                System.out.print("Ivestas zodis "+word+" yra lyginis, jo ilgis yra "+ word.length());
            } else{
                System.out.println("Zodis "+word+" yra nelyginis, jo ilgis yra "+word.length());
            }


        char letter='a';

        System.out.println("Radome "+letter+" raidziu:"+countHowLettersHaveWord(word,letter));
    }}

    //kuriam metoda paskaiciuot kiek a raidziu

    private static int countHowLettersHaveWord(String word,char letter){
        int count=0;
        for(int i=0; i< word.length(); i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }
}
