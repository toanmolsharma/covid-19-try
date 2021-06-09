import java.sql.*;

public class regi {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_reg?user=root&password=root");
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeUpdate("select * from register");
//            while(rs.next()){
//                String email = rs.getString("email");
//            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
