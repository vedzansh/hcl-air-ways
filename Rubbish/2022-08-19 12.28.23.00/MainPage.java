import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.lang.model.element.Name;

public class MainPage extends Thread {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Connection conn = DBConnection.getConnection();
        // This is main function
        welcome();
        // emding();
        // useagain();
        // wlcart();
        // welcome();
        // lomgin();

    }

    static void welcome() {

        // This is welcome function
        Scanner scam = new Scanner(System.in);

        // System.out.println("\n\n\t ...........Welcome to HCL Fly Ways...........");
        // System.out.println();
        wlcart();
        // Page
        // System.out.println("\t\t\t .....Login.....");
        System.out.println("     _______________");
        System.out.println("    |               |");
        System.out.println("    |  Login Page   |");
        System.out.println("    |_______________|");
        System.out.println("           ||     ");
        System.out.println("   (\\_/)   ||     ");
        System.out.println("  ( >_> )  ||     ");
        System.out.println("  /      \\ /     ");
        lomgin();

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
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    static void lomgin() {
        System.out.println("\n\tWelcome to login screen, please enter your credentials continue :)");
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
                //

            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

    static void userpage() throws SQLException, ClassNotFoundException {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);

            System.out.println("     _______________");
            System.out.println("    |               |");
            System.out.println("    |  User Page    |");
            System.out.println("    |_______________|");
            System.out.println("           ||     ");
            System.out.println("   (\\_/)   ||     ");
            System.out.println("  ( >_> )  ||     ");
            System.out.println("  /      \\ /     ");

            System.out.println("----------WELCOME TO HCL AIRLINE----------");
            System.out.println("ENTER 1 FOR FLIGHT TICKET BOOKING");
            System.out.println("ENTER 2 FOR TICKET CANCELLATION");

            int ch = sc.nextInt();
            if (ch == 1) {
                Scanner sc1 = new Scanner(System.in);
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
                    int ticket_id;
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
                    ticket_id = rs2.getInt(1);
                    String r = "{call add_reservation(?,?,?,?,?,?,?)}";
                    CallableStatement cl = conn.prepareCall(r);
                    cl.setString(1, pnr_no);
                    cl.setInt(2, ticket_id);
                    cl.setString(3, f_code);
                    cl.setString(4, j_date);
                    cl.setString(5, j_time);
                    cl.setString(6, f_src);
                    cl.setString(7, f_dst);
                    cl.executeUpdate();
                    // pnr_no , ticket_id , f_code , jny_date , jny_time , src , dst
                    String m = "{call add_passenger(?,?,?,?,?,?,?,?)}";
                    CallableStatement cm = conn.prepareCall(m);
                    cm.setString(1, pnr_no);
                    cm.setString(2, address);
                    cm.setString(3, nationality);
                    cm.setString(4, name);
                    cm.setString(5, gender);
                    cm.setString(6, ph_no);
                    cm.setString(7, passport_no);
                    cm.setString(8, f_code);
                    cm.executeUpdate();
                    System.out.println("            +-+-TICKET DETAIL-+-+");
                    System.out.println("            TICKET NUMBER  : " + ticket_id);
                    System.out.println("            PNR_NO         : " + pnr_no);
                    System.out.println("            NAME           : " + name);
                    System.out.println("            NATIONALITY     : " + nationality);
                    System.out.println("            PH_NO          : " + ph_no);
                    System.out.println("            DATE OF JOUREY : " + j_date);
                    System.out.println("            GENDER         : " + gender);
                    System.out.println("            ADDRESS        : " + address);
                    System.out.println("            PASSPORT_NO    : " + passport_no);
                    System.out.println("            TOTAL_CHARGE   : " + t_charge);

                    System.out.println("*****THANK YOU USING HCL AIRLINE*****");

                    System.out.println("\n\n\n\n");

                    useagain();

                } else {
                    return;
                }

            } else if (ch == 2) {
                Scanner sc3 = new Scanner(System.in);
                Scanner sc4 = new Scanner(System.in);
                LocalDateTime current = LocalDateTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
                String formatted = current.format(formatter);

                System.out.println("*******TICKET CENCELLATION SECTION*******");
                System.out.println("ENTER TICKET NUMBER");
                int ticket_id = sc3.nextInt();
                System.out.println("ENTER PNR NUMBER");
                String pnr_no = sc4.nextLine();
                ResultSet rs2 = stmt.executeQuery("select*from ticket where pnr_no='" + pnr_no + "'");
                rs2.next();
                ticket_id = rs2.getInt(1);
                String k = "select name passport_no into name,passport_no from passenger where pnr_no=pnr_no";
                ResultSet rs3 = stmt.executeQuery(k);
                rs3.next();
                String name1 = rs3.getString(1);
                String pass_no = rs3.getString(2);
                String s = "{CALL cancel_ticket(?,?,?,?)}";
                CallableStatement cs = conn.prepareCall(s);
                cs.setInt(1, ticket_id);
                cs.setString(2, pnr_no);
                cs.setString(3, formatted);
                cs.registerOutParameter(4, Types.VARCHAR);
                cs.executeUpdate();
                String status = cs.getString(4);
                System.out.println(status);
                String he = "TICKET CANCELLED SUCCESSFULLY....!!";
                if (he.equals(status)) {
                    System.out.println("TICKET WITH NAME : " + name1 + " AND PASSPORT NUMBER IS CANCELLED");
                }else{
                    System.out.println("");
                }
            } else {
                System.out.println("INVALID CHOICE");

            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("NO DATA AVAILABLE FOR GIVEN CHOICE");
        }
        useagain();

    }

    static void adminconsole() throws SQLException, ClassNotFoundException {

        System.out.println("     _______________");
        System.out.println("    |               |");
        System.out.println("    | Admin Console |");
        System.out.println("    |_______________|");
        System.out.println("           ||     ");
        System.out.println("   (\\_/)   ||     ");
        System.out.println("  ( 0_0 )  ||     ");
        System.out.println("  /      \\ /     ");

        Scanner sc4 = new Scanner(System.in);
        Connection conn = DBConnection.getConnection();
        // String admin_username;
        // String admin_password;
        // System.out.println("ENTER THE ADMIN_USERNAME");
        // admin_username = sc4.nextLine();
        // System.out.println("ENTER THE ADMIN_PASSWORD");
        // admin_password = sc4.nextLine();
        System.out.println("WELCOME TO ADMIN DESK");
        System.out.println("ENTER 1 FOR ADDING NEW FLIGHT");
        System.out.println("ENTER 2 FOR DELETING FLIGHT");
        System.out.println("ENTER 3 FOR VIEW ALL FLIGHT");
        System.out.println("ENTER 4 FOR VIEW ALL CENCELLED TICKET");

        System.out.println("");
        int ch4 = sc4.nextInt();
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
            Connection conn1 = DBConnection.getConnection();
            System.out.println("ENTER FLIGHT CODE PLEASE");
            String f_code = sc4.nextLine();
            String s = "{CALL delete_flight(?,?)}";
            CallableStatement cs = conn1.prepareCall(s);
            cs.setString(1, f_code);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.executeQuery();
            String Status = cs.getString(2);
            System.out.println(Status);
        } else if (ch4 == 3) {
            System.out.println("--ALL FLIGHTS DETAIL");
            String j = "select*from flight";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(j);
            while (rs.next()) {
                System.out.print("Flight code : " + rs.getString(1));
                System.out.print(", Flight name : " + rs.getString(2));
                System.out.print(", Source loction : " + rs.getString(3));
                System.out.print(", Destination : " + rs.getString(4));
                System.out.print(", time : " + rs.getString(5));
                System.out.print(", Charge " + rs.getString(6));
                System.out.print(", Class" + rs.getString(7));
                System.out.println("");

            }

        } else if (ch4 == 4) {
            System.out.println("--CANCELLED TICKETS DETAILS--");
            String w = "select*from cancellation";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(w);
            while (rs.next()) {
                System.out.print("PNR NO" + rs.getString(1));
                System.out.print(", CANCELLATION NO " + rs.getString(2));
                System.out.print(", CANCELLATION DATE " + rs.getString(3));
                System.out.println(", TICKET NUMBER" + rs.getString(4));
            }

        } else {
            System.out.println("INVALID OPTION");
        }
        useagain();
    }

    static void wlcart() {

        //
        // \----------------------------------\
        // \ \ __
        // \ Hello there, \ | \
        // &gt; &gt;------| \ ______
        // / Welcome to HCL FLY WAYS / --- \_____/**|_|_\____ |
        // / / \_______ --------- __&gt;-}
        // /----------------------------------/ / \_____|_____/ |
        // * |
        // {O}
        // Hello there, Welcome to HCL FLY WAYS
        //
        //

        System.out.println("\n\n\n");
        System.out.println("  \\----------------------------------\\                                                ");
        System.out.println("   \\                                  \\          __                                    ");
        System.out
                .println("    \\  Hello there,                    \\         | \\                                   ");
        System.out.println("     >                                  >--------|  \\       ______                     ");
        System.out.println("    /        Welcome to HCL FLY WAYS   /       ----  \\____/```|_|_\\___   |            ");
        System.out.println("   /                                  /          \\_______ ---HCL---__ />>->           ");
        System.out.println("  /----------------------------------/              /  \\_____|____/      |            ");
        System.out.println("                                                   *          |                         ");
        System.out.println("                                                             {O}                        ");
        // ------------------------------------------------------------------------------------------------------

    }

    static void useagain() {
        System.out.println("/~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\   _~~.    ");
        System.out.println("|  Press Enter to continue   ~/ (_° /    ");
        System.out.println(" \\    or E to Exit          /    '`     ");
        System.out.println("  \\________________________/");
        Scanner scam69 = new Scanner(System.in);
        if (scam69.equals("E") || scam69.equals("e")) {
            emding();
        } else {
            welcome();
        }

    }

    static void emding() {
        System.out.println("                        ___");
        System.out.println("                        \\ \\");
        System.out.println("                         \\ `\\");
        System.out.println("      ___                 \\  \\");
        System.out.println("     |    \\                \\  `\\");
        System.out.println("     |_HCL_\\                \\    \\");
        System.out.println("     |______\\                \\    `\\");
        System.out.println("     |       \\                \\     \\");
        System.out.println("     |      __\\__---------------------------------._.          ");
        System.out.println("   __|---~~~__o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_[][\\__       ");
        System.out.println("  |___                HCL      /~      ) FLY WAYS       \\__    ");
        System.out.println("      ~~~---..._______________/      ,/_________________/       ");
        System.out.println("                             /      /                           ");
        System.out.println("    Thanks For Using        /     ,/                            ");
        System.out.println("                           /     /    Credits:-                         ");
        System.out.println("       Our                /    ,/                               ");
        System.out.println("                         /    /          @Anup: JDBC + SQL                     ");
        System.out.println("          Program :)    //  ,/           @Vedansh: Java                     ");
        System.out.println("                       //  /             @KirtI: PL/SQL                   ");
        System.out.println("                      // ,/              @Sneha: Docs && PL/SQL                       ");
        System.out.println("                     //_/                @Mahesh: Docs                       ");
    }

}
