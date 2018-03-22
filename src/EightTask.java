/*
Parašyti programą dvimačio masyvo (matricos)   elementų, kurie didesni už 5, sumai surasti.
 */
public class EightTask {
    public static void main(String[] args) {
        int [][] matrica={{2,3,-9,5,6,8},{5,4,7,8,-6}};
        int suma=0;
        for(int i=0; i<matrica.length; i++){
            for(int j=0; j<matrica[i].length; j++){
                if(matrica[i][j]>5){
                    suma+=matrica[i][j];
                }
            }
        }
        System.out.println("Elementu didesniu uz 5 suma yra: "+suma);
    }
}
