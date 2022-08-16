import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner S = new Scanner(System.in);
        System.out.println("--------AIRLINE MANAGEMENT SYSTEM--------");
        System.out.println("ENTER THE CREDIANTIALS");
        //System.out.println("ENTER USERNAME : ");
        //String u_name = S.nextLine();
        System.out.println("ENTER PASSWORD : ");
        String pass = S.nextLine();
        Connection conn = DBConnection.getConnection();
        String u_name="admin";
        String q = ("select * from login where username='" + u_name + "'");
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(q);
            rs.next(); 
            String U = rs.getString(1);
            String P = rs.getString(2);
            //System.out.println(U+"  "+P);
       
        if (pass.equals(P)) {
            System.out.println("----------WELCOME TO HCL AIRLINE----------");
            System.out.println("ENTER 1 FOR FLIGHT INFORMATION");
            System.out.println("ENTER 2 FOR ADD CUSTOMER");
            System.out.println("ENTER 3 FOR CUSTOMER DETAIL");
            System.out.println("ENTER 4 FOR CANCELLATION");
            System.out.println("ENTER 5 FOR TICKET BOOKING");
            System.out.println("");

        } else {
            System.out.println("INVALID PASSWORD TRY AGAIN");
        }{

        }

    }

}
