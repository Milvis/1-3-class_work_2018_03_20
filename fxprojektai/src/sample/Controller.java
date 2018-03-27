package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML; //butinai javafx
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private Label myDummyText; //javafx
    @FXML
    private TextField myDummyTextField;

    public void changeText(ActionEvent event) { //actionevent -javafx
        String txt = myDummyText.getText();
        String input = myDummyTextField.getText();
       myDummyTextField.setText("");
       myDummyText.setText(txt + " " + input);

    }
}
