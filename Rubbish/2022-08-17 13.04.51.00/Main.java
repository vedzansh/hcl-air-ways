
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------AIRLINE MANAGEMENT SYSTEM--------");
        System.out.println("WELCOME TO HCL AIRLINE");
        System.out.println("ENTER 1 USER LOGIN ");
        System.out.println("ENTER 2 ADMIN LOGIN ");
        int ch1 = sc.nextInt();
        switch (ch1) {
            case 1: {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("ENTER THE CREDIANTIALS");
                System.out.println("ENTER USERNAME : ");
                String u_name = sc1.nextLine();
                System.out.println("ENTER PASSWORD : ");
                String pass = sc1.nextLine();
                Connection conn = DBConnection.getConnection();
                String q = ("select * from login where username='" + u_name + "'");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery(q);
                rs.next();
                String U = rs.getString(1);
                String P = rs.getString(2);
                // System.out.println(U+" "+P);

                if (pass.equals(P)) {
                    System.out.println("----------WELCOME TO HCL AIRLINE----------");
                    System.out.println("ENTER 1 FOR FLIGHT TICKET BOOKING");
                    System.out.println("ENTER 2 FOR TICKET CANCELLATION");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("ENTER THE SOURCE LOCATION");
                            String src = sc2.nextLine();
                            System.out.println("ENTER THE DESTINATION");
                            String dst = sc2.nextLine();
                            String s = "select*from flight where dst='" + dst + "'";
                            Statement stmt1 = conn.createStatement();
                            ResultSet rs1 = stmt.executeQuery(s);
                            String f_code;
                            String f_name;
                            String f_src;
                            String f_dst;
                            while (rs1.next()) {
                                f_code = rs1.getString(1);
                                f_name = rs1.getString(2);
                                f_src = rs1.getString(3);
                                f_dst = rs1.getString(4);
                            }
                            System.out.println("Available fights ");
                            System.out.println("FLIGHT CODE" + f_code);
                            System.out.println("FLIGHT NAME" + f_name);

                            String pnr_no;
                            String address;
                            String nationality;
                            String name;
                            String gender;
                            String ph_no;
                            String passport_no;
                            System.out.println("ENTER PNR NUMBER");
                            pnr_no = sc2.nextLine();
                            System.out.println("ENTER NAME ");
                            name = sc2.nextLine();
                            System.out.println("ENTER THE NATIONALITY");
                            nationality = sc2.nextLine();
                            System.out.println("ENTER THE PHONE NUMBER");
                            ph_no = sc2.nextLine();
                            System.out.println("ENTER THE ADDRESS");
                            address = sc2.nextLine();
                            System.out.println("ENTER THE PASSPORT NUMBER");
                            passport_no = sc2.nextLine();

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
                break;
            }
            case 2: {
                String admin_username;
                String admin_password;
                System.out.println("ENTER THE ADMIN_USERNAME");
                admin_username = sc.nextLine();
                System.out.println("ENTER THE ADMIN_PASSWORD");
                admin_password = sc.nextLine();
            }

        }

    }
}