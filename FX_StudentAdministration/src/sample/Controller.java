package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<Student> table;                 //reikia klases Student
    @FXML
    private TableColumn<Student, Integer> id;           //S-objektas T-tipas
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> surname;
    @FXML
    private TableColumn<Student, String> phone;
    @FXML
    private TableColumn<Student, String> email;


    @Override
    public void initialize(URL location, ResourceBundle resources) {  //metodas buskraunasmas pats pirmas pries varotojui parodant
        Connection connection = MyDatabaseConnectionHandler.getConnection();

        id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
        phone.setCellValueFactory(new PropertyValueFactory<Student, String>("phone"));
        email.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
        //   createDummyData(); testavimui be DB
        pullDataFromDb(connection);

        if (connection != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);  //information nurodo logotipa
            alert.setContentText("Prisijungėme sėkmingai prie mūsų DB");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Prisijungti prie DB nepavyko!!!");
            alert.show();
        }
    }

    //metodas is db nuskaityt
    private void pullDataFromDb(Connection connection) {
        if (connection != null) {
            try {
                Statement st = connection.createStatement();

                ResultSet resultSet = st.executeQuery("SELECT * FROM students");

                List<Student> students = new ArrayList<>();

                while (resultSet.next()) {
                    //pasiimti irasus
                    //  int id = resultSet.getInt()
                    students.add(new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("phone"),
                            resultSet.getString("email")));
                }

                table.setItems(FXCollections.observableList(students));


            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }


//susirkuriam testavimui data be DB
//    private void createDummyData() {
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "Andrius", "Baltrunas", "+37069841221", "andrius@kcs.lt"));
//        students.add(new Student(2, "Marius", "Karlis", "+37069426987", "Marius@kcs.lt"));
//        students.add(new Student(3, "Petras", "Nara", "+37069486875", "petras@kcs.lt"));
//        students.add(new Student(4, "Jonas", "Stasiulis", "+37054201144", "jonas@kcs.lt"));
//
//        ObservableList<Student> mockStudents = FXCollections.observableList(students); //observablelist kintamas tokio praso setItems
//        table.setItems(mockStudents);
//
//    }

}
