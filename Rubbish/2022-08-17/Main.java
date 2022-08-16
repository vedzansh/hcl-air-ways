import java.sql.Connection;
import java.sql.*;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner S = new Scanner(System.in);
        List<Flight_info> info = new ArrayList<>();
        Flight_infoDAO obj = new Flight_infoDAO();
        System.out.println("--------AIRLINE MANAGEMENT SYSTEM--------");
        System.out.println("WELCOME TO HCL AIRLINE");
        System.out.println("ENTER 1 USER LOGIN ");
        System.out.println("ENTER 2 ADMIN LOGIN ");
        System.out.println("ENTER THE CREDIANTIALS");
        // System.out.println("ENTER USERNAME : ");
        // String u_name = S.nextLine();
        System.out.println("ENTER PASSWORD : ");
        String pass = S.nextLine();
        Connection conn = DBConnection.getConnection();
        String u_name = "admin";
        String q = ("select * from login where username='" + u_name + "'");
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(q);
        rs.next();
        String U = rs.getString(1);
        String P = rs.getString(2);
        // System.out.println(U+" "+P);

        if (pass.equals(P)) {
            System.out.println("----------WELCOME TO HCL AIRLINE----------");
            System.out.println("ENTER 1 FOR TICKET BOOKING");
            System.out.println("ENTER 2 FOR TICKET CANCELLATION");
            int ch = S.nextInt();
            switch (ch) {
                case 1:
                    info = obj.getFlight_info();
                    System.out.format("%-5s %-5s %-15s %-10s\n", "FLight code", "Flight Name", "source", "destination");
                    for(Flight_info flight : info)
                    System.out.format("%-5s %-5s %-15s %-10s \n", flight.getf_code(), flight.getf_name(),flight.getsrc(), flight.getdst());

                    break;
                case 2:
                

                    break;

                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        } else {
            System.out.println("INVALID PASSWORD TRY AGAIN");
        }
        {

        }

    }

}
