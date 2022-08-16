import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flight_infoDAO {
    public Flight_info getFlight_info() throws ClassNotFoundException, SQLException {
        Flight_info f;
        Scanner sc = new Scanner(System.in);
        List<Flight_info>list=new ArrayList<>();
        System.out.println("Enter the destination: ");
        String destination = sc.next();
        Connection conn = DBConnection.getConnection();
        String s = "select*from flight where dst='" + destination + "'";
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(s);
        while(rs.next()){
        f = new Flight_info(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        list.add(f);
        }
        return list;
    }
    
}
