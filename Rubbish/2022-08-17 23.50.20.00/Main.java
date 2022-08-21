
import java.sql.*;
import java.util.*;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.lang.model.element.Name;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------AIRLINE MANAGEMENT SYSTEM--------");
        System.out.println("WELCOME TO HCL AIRLINE");
        System.out.println("ENTER 1 USER LOGIN ");
        System.out.println("ENTER 2 ADMIN LOGIN ");
        int ch1 = sc.nextInt();
        if (ch1 == 1) {

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
                        cs.setString(1,pnr_no);
                        cs.setString(2,f_class);
                        cs.setString(3,t_charge);
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

        } else if (ch1 == 2) {
            String admin_username;
            String admin_password;
            System.out.println("ENTER THE ADMIN_USERNAME");
            admin_username = sc.nextLine();
            System.out.println("ENTER THE ADMIN_PASSWORD");
            admin_password = sc.nextLine();
            System.out.println("WELCOME TO ADMIN ");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");


        } else {
            System.out.println("INVALID CHOICE TRY AGAIN");
            return;

        }

    }

}