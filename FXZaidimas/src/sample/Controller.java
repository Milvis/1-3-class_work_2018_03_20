package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.InputMismatchException;
import java.util.Random;

public class Controller {
    @FXML
    private Label isvedimas; //javafx
    @FXML
    private TextField ivedimoLaukas;

    public void spejimas(ActionEvent event) { //actionevent -javafx

        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1; //kad isvestu 10 skaiciu o ne iki 9 ir be 0.
       try{
        int sk = Integer.valueOf(ivedimoLaukas.getText()); //string konvert i integer nes i textfield tik string isiveda tada paverciam i int
        ivedimoLaukas.setText("");
        if(randomNumber==sk){
         //   System.out.println("Jus atspejote skaicius buvo "+sk);
            isvedimas.setText("Jūs atspėjote "+"\nSugeneruotas skaičius buvo "+randomNumber+"\nJūsų spėtas skaičius buvo "+sk);
        }else{
         //   System.out.println("Spekite dar karta");
            isvedimas.setText("Spėkite dar kartą, sugeneruotas skaičius buvo "+randomNumber+"\nJūsų spėtas skaičius buvo "+sk);
        }} catch (NumberFormatException e){

           //alert objektas
           ivedimoLaukas.setText("");
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Ką čia darai?");
           alert.show();
         // isvedimas.setText("Blogai įvestas skaičius");
       }

}

    }
