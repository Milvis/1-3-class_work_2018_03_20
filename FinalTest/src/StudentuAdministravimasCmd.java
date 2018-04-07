import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class StudentuAdministravimasCmd {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs?autoReconnect=true&useSSL=false";
    private static final String LOGIN_NAME = "root";
    private static final String PASSWORD = "";


    public static void main(String[] args) {

        Connection connection = prisijungtiPrieDb();
        duomenysIsDb(connection);

    }

    //duomenu nuskaitymo is DB metodas
    private static void duomenysIsDb(Connection connection) {
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM persons");
                List<Studentai> studentai = new ArrayList<>();
                if (resultSet.next()) {
                    do {
                        studentai.add(new Studentai(resultSet.getInt("id"), resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getString("phone"), resultSet.getString("email")));
                    } while (resultSet.next());
                        System.out.println();
                        System.out.println("Duomenu bazeje esanciu studentu sarasas:");
                        spausdtinti(studentai);
                }
                else {
                    //jeidu lentele tuscia irasom i ja studenta
                    System.out.println("Lentele pateiktoje DB yra tuscia, pridesime viena studenta");
                    duomenysIdetiIDb(connection);
                    //kad atspausdinti atnaujinta lentele naudojam nuskaitymo metoda
                    duomenysIsDb(connection);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //metodas ideti i DB
    private static void duomenysIdetiIDb(Connection connection) {
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                st.execute("INSERT INTO persons(name,surname,phone,email)VALUES('Alvydas','Trambulis','+368745214','alvydopastas@gmail.com')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    ///prisijungimo prie DB metodas
    public static Connection prisijungtiPrieDb() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, LOGIN_NAME, PASSWORD);
            System.out.println("Prisijungti prie DB pavyko");
        } catch (SQLException e) {
            System.out.println("Nepavyko prisijungti prie DB" + e);
        }
        return connection;
    }

    //metodas spausdinti
    private static void spausdtinti(List<Studentai> studentai) {
        studentai.forEach(student -> {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPhone() + " " + student.getEmail());
        });
    }


}
