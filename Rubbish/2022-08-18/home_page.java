import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;
import javax.imageio.stream.FileCacheImageInputStream;
import javax.lang.model.element.Name;

public class home_page extends Thread {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // This is main function
        welcome();
        // lomgin();

    }

    static void welcome() {

        // This is welcome function
        Scanner scam = new Scanner(System.in);

        System.out.println("\n\n\t ...........Welcome to HCL Fly Ways...........");
        System.out.println();
        System.out.println("\t\t\t .....Login.....");
        lomgin();
        // System.out.println("Press Enter to login :)");
        // System.out.println("Press r to register yourself");

        // String a = scam.nextLine();
        // switch (a) {
        // case "r":
        // case "R":
        // // call register function
        // regimster();
        // break;
        // default:
        // // System.out.println("Login page");
        // // call login function
        // lomgin();
        // break;
        // }
    }

    static void regimster() {
    Scanner screg = new Scanner(System.in);
    System.out.println("\tWelcome to registration page, please choose :)");

    try {
    System.out.print("Enter username: ");
    String username = screg.nextLine();
    System.out.print("\nEnter password: ");
    String pass = screg.nextLine();
    System.out.print("\nEnter password once again: ");
    String repass = screg.nextLine();
    // if () {

    // } else {

    // }
    } catch (Exception e) {
    // TODO: handle exception
    }

    }

    static void lomgin() {
        System.out.println("\tWelcome to login screen, please enter your credentials continue :)");
        for (;;) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("\nPlease enter your username: ");
                String username = sc.nextLine();
                try {
                    if (username.equals("admin")) {
                        System.out.print("Enter password for user: ");
                        String a_pass = sc.nextLine();
                        if (a_pass.equals("admin_123")) {
                            adminconsole();
                            break;
                        } else {
                            System.out.println("Wrong password for admin console.");
                        }
                    } else if (username.equals("user")) {
                        userpage();
                        break;
                    } else {
                        System.out.println("Invalid username or password please try again :)");
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }

                // System.out.print("Please enter your password: ");
                // String password =sc.nextLine();

                // if (username.equals("admin") && password.equals("admin_123")) {
                // System.out.println("This is an admin console");
                // } else if (username != ("admin")) {
                // System.out.println("Hiee this is user ");
                // }

            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

    static void userpage() {
        System.out.println("Hello this is user page");
        String q = ("select * from login where username='" + u_name + "'");
        Connection conn;
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(q);
        rs.next();
        String U = rs.getString(1);
        String P = rs.getString(2);
        // System.out.println(U+" "+P);

        Object pass;
        if (pass.equals(P)) {
            System.out.println("----------WELCOME TO HCL AIRLINE----------");
            System.out.println("ENTER 1 FOR FLIGHT TICKET BOOKING");
            System.out.println("ENTER 2 FOR TICKET CANCELLATION");
            Scanner sc;
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("PLEASE ENTER DETAIL IN UPPER CASE");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("ENTER THE SOURCE LOCATION");
                String src = sc2.nextLine();
                System.out.println("ENTER THE DESTINATION");
                String dst = sc2.nextLine();
                System.out.println("ENTER FLIGHT CLASS");
                String f_class = sc2.nextLine();
                String s = "select*from flight where dst='" + dst + "' and src='" + src + "' and class ='" + f_class
                        + "'";
                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt.executeQuery(s);
                String f_code;
                String f_name;
                String f_src;
                String f_dst;
                String j_time;
                String t_charge;

                rs1.next();
                f_code = rs1.getString(1);
                f_name = rs1.getString(2);
                f_src = rs1.getString(3);
                f_dst = rs1.getString(4);
                j_time = rs1.getString(5);
                t_charge = rs1.getString(6);

                System.out.println("Available fights ");
                System.out.print("FLIGHT CODE   : ");
                System.out.println(f_code);
                System.out.print("FLIGHT NAME   : ");
                System.out.println(f_name);
                System.out.print("FLIGHT TIME   : ");
                System.out.println(j_time);
                System.out.print("FLIGHT CHARGE : ");
                System.out.println(t_charge);
                System.out.println("PRESS ENTER FOR 1 CONTINUE");
                Scanner sc1;
                int ch2 = sc1.nextInt();
                if (ch2 == 1) {

                    String pnr_no;
                    String address;
                    String nationality;
                    String name;
                    String gender;
                    String j_date;
                    String ph_no;
                    String passport_no;
                    String ticket_id;
                    System.out.println("PLEASE ENTER DETAIL IN UPPER CASE");
                    System.out.println("ENTER PNR NUMBER");
                    pnr_no = sc2.nextLine();
                    System.out.println("ENTER NAME ");
                    name = sc2.nextLine();
                    System.out.println("ENTER THE NATIONALITY");
                    nationality = sc2.nextLine();
                    System.out.println("ENTER THE PHONE NUMBER");
                    ph_no = sc2.nextLine();
                    System.out.println("ENTER THE GENDER");
                    gender = sc2.nextLine();
                    System.out.println("ENTER THE DATE OF JOURNEY");
                    j_date = sc2.nextLine();
                    System.out.println("ENTER THE ADDRESS");
                    address = sc2.nextLine();
                    System.out.println("ENTER THE PASSPORT NUMBER");
                    passport_no = sc2.nextLine();
                    System.out.println("---ENTERED DETAIL---");

                    System.out.println("--NOW YOU CAN USE CREDIT CARD FOR YOUR PAYMENT--");
                    System.out.println("IF YOU CANCEL THE FLIGHT ONLY 40% OF PAYMENT WILL BE REFUND");
                    System.out.println("ENTER 1  FOR CONTINUE");
                    int ch3 = sc2.nextInt();
                    if (ch3 == 1) {
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("ENTER CARD NUMBER :");
                        String card_no = sc3.nextLine();
                        System.out.println("ENTER CVV");
                        String cvv_no = sc3.nextLine();
                        System.out.println("ENTER PIN ");
                        String pin = sc3.nextLine();
                        int len = pin.length();
                        if (len == 4) {
                            System.out.println("PAYMENT RECEIVED");

                            System.out.println("TICKET BOOKED SUCCESSFULLY");
                        }

                    } else {
                        System.out.println("WRONG PIN");
                        return;
                    }
                    String t = "{call ticket_add(?,?,?)}";
                    CallableStatement cs = conn.prepareCall(t);
                    cs.setString(1, pnr_no);
                    cs.setString(2, f_class);
                    cs.setString(3, t_charge);
                    cs.executeQuery();
                    ResultSet rs2 = stmt.executeQuery("select*from ticket where pnr_no='" + pnr_no + "'");
                    rs2.next();
                    ticket_id = rs2.getString(1);
                    String r = "INSERT INTO  reservation VALUES('" + pnr_no + "', '" + ticket_id + "', '" + f_code
                            + "', '" + j_date + "', '" + j_time + "', '" + f_src + "', '" + f_dst + "')";
                    ResultSet rs3 = stmt.executeQuery(r);
                    System.out.println("+-+-TICKET DETAIL-+-+");
                    System.out.println("TICKET NUMBER  : " + ticket_id);
                    System.out.println("PNR_NO         : " + pnr_no);
                    System.out.println("NAME           : " + name);
                    System.out.println("NATIONLITY     : " + nationality);
                    System.out.println("PH_NO          : " + ph_no);
                    System.out.println("DATE OF JOUREY : " + j_date);
                    System.out.println("GENDER         : " + gender);
                    System.out.println("ADDRESS        : " + address);
                    System.out.println("PASSPORT_NO    : " + passport_no);
                    System.out.println("TOTAL_CHARGE   : " + t_charge);

                    System.out.println("*****THANK YOU USING HCL AIRLINE*****");

                } else {
                    return;
                }

            } else if (ch == 2) {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("*******TICKET CENCELLATION SECTION*******");
                System.out.println("ENTER TICKET NUMBER");
                int ticket_id = sc3.nextInt();
                String s = "{CALL cancel_ticket(?,?)}";
                CallableStatement cs = conn.prepareCall(s);
                cs.setInt(1, ticket_id);
                cs.registerOutParameter(2, Types.VARCHAR);
                cs.executeUpdate();
                String status = cs.getString(2);
                System.out.println(status);
            } else {
                return;
            }

        } else {
            System.out.println("INVALID PASSWORD TRY AGAIN");
            return;
        }

    }


    static void adminconsole() {
        System.out.println("This is an admin console");
        Scanner sc4 = new Scanner(System.in);
        String admin_username;
        String admin_password;
        System.out.println("ENTER THE ADMIN_USERNAME");
        admin_username = sc4.nextLine();
        System.out.println("ENTER THE ADMIN_PASSWORD");
        admin_password = sc4.nextLine();
        System.out.println("WELCOME TO ADMIN DESK");
        System.out.println("ENTER 1 FOR ADDING NEW FLIGHT");
        System.out.println("ENTER 2 FOR DELETING FLIGHT");
        System.out.println("ENTER 3 FOR UPDATE FLIGHT ");
        System.out.println("ENTER 4 FOR VIEW ALL FLIGHT");
        int ch4 = sc4.nextInt();
        Connection conn;
        if (ch4 == 1) {
            String f_code;
            String f_name;
            String f_src;
            String f_dst;
            String f_time;
            String f_charge;
            String f_class;

            System.out.println("-------ENTER FLIGHT DETAIL-------");
            System.out.println("ENTER FLIGHT CODE");
            f_code = sc4.nextLine();
            System.out.println("ENTER FLIGHT NAME");
            f_name = sc4.nextLine();
            System.out.println("ENTER FLIGHT SOURCE LOCATION");
            f_src = sc4.nextLine();
            System.out.println("ENTER FLIGHT DISTINATION");
            f_dst = sc4.nextLine();
            System.out.println("ENTER FLIGHT TIME");
            f_time = sc4.nextLine();
            System.out.println("ENTER FLIGHT CHARGE ");
            f_charge = sc4.nextLine();
            System.out.println("ENTER FLIGHT CLASS");
            f_class = sc4.nextLine();
            String s = "{CALL add_flight(?,?,?,?,?,?,?,?)}";
            CallableStatement cs = conn.prepareCall(s);
            cs.setString(1, f_code);
            cs.setString(2, f_name);
            cs.setString(3, f_src);
            cs.setString(4, f_dst);
            cs.setString(5, f_time);
            cs.setString(6, f_charge);
            cs.setString(7, f_class);
            cs.registerOutParameter(8, Types.VARCHAR);
            cs.executeUpdate();
            String Status = cs.getString(8);
            System.out.println("status");
        } else if (ch4 == 2) {
            System.out.println("ENTER FLIGHT CODE PLEASE");
            String f_code = sc4.nextLine();
            String s = "{CALL delete_flight(?,?)}";
            CallableStatement cs = conn.prepareCall(s);
            cs.setString(1, f_code);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.executeQuery();
            String Status = cs.getString(2);
            System.out.println(Status);
        } else if (ch4 == 3) {

        } else if (ch4 == 4) {

        } else {
            System.out.println("INVALID OPTION");
        }
    }
}