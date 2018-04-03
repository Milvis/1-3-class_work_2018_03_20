import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionToDatabase {

    //metodas prisijungimui prie db
//nuskaitom propetries faila
    public Connection getconnection() {
        InputStream stream = getClass().getResourceAsStream("../properties/Database.properties");
        Properties properties = new Properties();
        Connection con = null;

        try {
            properties.load(stream);  //uzdedam try catch nes gali neuzloadint properties
            //loadinam driverius
            getClass().forName(properties.getProperty("mysqldrivers"));

            con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
//sudejom tris try catch blokus i viena
        } catch (Exception e) {
         System.out.println(e);
        }

        return con;
    }
}
