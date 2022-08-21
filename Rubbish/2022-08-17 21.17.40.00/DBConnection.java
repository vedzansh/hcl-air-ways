import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class DBConnection {
public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
    return con;
}
}