package penkta;


import java.util.*;

public class UzdavinysKodavimas {
    public static void main(String[] args) {
        //sukurpiam du MAP
        Map<Integer, String> codeMap = new HashMap<>();
        Map<String, Integer> valuesMap = new HashMap<>();
        Set<Integer> items = new HashSet<>();
        //paduodam MAP objektui
        ReadCodeService readCodeService = new ReadCodeService();
        try {
            readCodeService.readFilePutToMaps(codeMap, valuesMap);

            //uzkodavimas is konsoles
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite teksta kodavimui");
            String line = scanner.nextLine();  //nuskaitom eilute

            for (int i = 0; i < line.length(); i++) {
                String temp = String.valueOf(line.charAt(i)); //char i string konvertuoja
                String letter = temp.equals(" ") ? "tarpas" : temp; //tarpa uzkoduojami zodi tarpas, visa kita paliekam kaip yra
                System.out.print(valuesMap.get(letter) + " "); //uzkodavimas


                //sudeti viska i seta ir i faila
//                //atkodavimas
//                System.out.println("IVeskite koduota teksta:");
//                String line2=scanner.nextLine();
//                for(int j=0; j<line2.length(); j++){
//                    String temp1 = String.valueOf(line.charAt(i)); //char i string konvertuoja
//                    String letter1=temp1.equals(" ")?"tarpas":temp1; //tarpa uzkoduojami zodi tarpas, visa kita paliekam kaip yra
//                    System.out.print(codeMap.get(letter1)+" "); //uzkodavimas

//
//
//                }
//            }

            }

            } catch(JACodeException e){
                System.out.println("Programa negali buti ivykdyta, nes koduote pazeista");
            }

        }
    }

