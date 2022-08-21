import java.sql.*;
 class OracleCon{
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##u1", "u1");


            // step3 create the statement object
            System.out.println("Connected");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
