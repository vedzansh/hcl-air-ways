public class test {
    public static void main(String[] args) {
        ticket_id = rs2.getString(1);
                    String r = "{call add_passenger(?,?,?,?,?,?,?)}";
                    CallableStatement cl = conn.prepareCall(r);
                    cl.setString(1, pnr_no);
                    cl.setString(2, ticket_id);
                    cl.setString(3, f_code);
                    cl.setString(4, j_date);
                    cl.setString(5, j_time);
                    cl.setString(6, f_src);
                    cl.setString(7, f_dst);
                    cl.executeUpdate();
    }
    
}
