
/*
6.  	Parašykite metodą kuris per parametrus paimtu du masyvus [1,2,3,4] ir [a,b,c,d] ir
kaip rezultatą grąžintu [1,a,2,b,3,c,4,d] kaip rezultatą.
 */


public class SixTask {
    public static void main(String[] args) {
        String[] mas1={"1","2","3","4"};
        String[] mas2={"a","b","c","d"};

      // System.out.println(sudetinis(mas1,mas2));

        System.out.print("Masyvo elementai: ");
        for (String a : sudetinis(mas1,mas2)) {
            System.out.print( a + ",");
        }
    }

    private static String[] sudetinis(String[] mas1,String[] mas2){

        String[] mas3=new String[(mas1.length+mas2.length)];
        int a=0;
        int b=1;
        for(int i=0;i<mas1.length; i++){
            mas3[a]=mas1[i];
            mas3[b]=mas2[i];
            a+=2;
            b+=2;
        }

        return mas3;
    }
}
