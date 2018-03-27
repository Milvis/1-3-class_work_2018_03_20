package testai;

public class TwoLoops {
    public static void main(String[] args) {
printKeturkampis(4,6);
    }

    public static void printKeturkampis (int eilute, int stulpelis){

        for(int i=1; i<=eilute; i++){
            int val=i%2==0?stulpelis:stulpelis;
            for(int j=0; j<val; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
