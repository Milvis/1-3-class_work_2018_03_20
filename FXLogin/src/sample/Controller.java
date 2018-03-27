package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {


        @FXML
        private Label myDummyText; //javafx
        @FXML
        private TextField ivedimoLaukas1;
        @FXML
        private TextField ivedimoLaukas2;

        public void changeText(ActionEvent event) { //actionevent -javafx
         //   String txt = myDummyText.getText();
            String input = ivedimoLaukas1.getText();
            ivedimoLaukas1.setText("");
          //  myDummyText.setText(txt + " " + input);
            String input2 = ivedimoLaukas2.getText();
            ivedimoLaukas2.setText("");
            myDummyText.setText(input + " " + input2);
        }
}

