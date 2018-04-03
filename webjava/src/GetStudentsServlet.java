import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//rootinis adresas "/"
@WebServlet(value = "/")
//extendinam httpservlet klase kad pasiekti override metodus
public class GetStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ConnectionToDatabase connectionToDatabase = new ConnectionToDatabase(); //sukuriam objekta
        Connection connection = connectionToDatabase.getconnection(); //kvieciam metoda is objekto ir priskiriam ji connection
        //apsisaugom kad nebutu null

        List<Students> students = new ArrayList<>();
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM students");  //pasiimam studentu lenetele
                while (resultSet.next()) {

                    Students student = new Students(resultSet.getInt("id"), resultSet.getString("name"),
                            resultSet.getString("surname"), resultSet.getString("phone"),
                            resultSet.getString("email"));
                //sudedam i sarasa list
                    students.add(student);
                }
            } catch (SQLException e) {
                System.out.println(e);

            }
        }


        req.setAttribute("students",students);
        req.getRequestDispatcher("students.jsp").forward(req,resp);
    }
}
