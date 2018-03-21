/*
7.Parašyti programą dvimačio masyvo (matricos)  teigiamų elementų kiekiui surasti.
 */
public class SevenTask {
    public static void main(String[] args) {
      // int[][] matrica=new int[5][];
        int[][] matrica={{12, 34, -4,},{12,-5,6,3}};
        int sum=0;
        for (int i=0;i<matrica.length;i++){
            for(int j=0;j< matrica.length+1;j++)
            if(matrica[i][j]>0){
                sum+=matrica[i][j];
            }
        }
        System.out.println(sum);
    }
}
