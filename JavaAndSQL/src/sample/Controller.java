package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.plaf.nimbus.State;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Studentai> table;
    @FXML
    private TableColumn<Studentai, Integer> id;
    @FXML
    private TableColumn<Studentai, String> name;
    @FXML
    private TableColumn<Studentai, String> surname;
    @FXML
    private TableColumn<Studentai, String> phone;
    @FXML
    private TableColumn<Studentai, String> email;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Connection connection = MyDatabaseConnectionHandler.getConnection();

        id.setCellValueFactory(new PropertyValueFactory<Studentai, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Studentai, String>("name"));
        surname.setCellValueFactory(new PropertyValueFactory<Studentai, String>("surname"));
        phone.setCellValueFactory(new PropertyValueFactory<Studentai, String>("phone"));
        email.setCellValueFactory(new PropertyValueFactory<Studentai, String>("email"));


      //  pullDataFromDB(connection);

        if (connection != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Sėkmingai prisijungėme prie DB");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Prisijugnti nepavyko!!!");
            alert.show();
        }

    }
    public void mygtukas(ActionEvent event){
        Connection connection = MyDatabaseConnectionHandler.getConnection();
        pullDataFromDB(connection);
    }


    //metodas nuskaitymui is DB
    private void pullDataFromDB(Connection connection) {
        if (connection != null) {

            try {
             Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM students");
                List<Studentai> studentais = new ArrayList<>();
                while (resultSet.next()) {
                    studentais.add(new Studentai(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("phone"),
                            resultSet.getString("email")));
                }
                table.setItems(FXCollections.observableList(studentais));
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
