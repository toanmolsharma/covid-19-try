import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class jdcon {

    public static void jdcon()
 {    
    try
    {
        
        Connection con = null;
         Class.forName("com.mysql.jdbc.Driver");
         con =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]","root","");
    }
    catch (ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null,e);
        exit(0);
    }
    
}

    static Connection con() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection CreateStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ResultSet executeQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class con {

        public con() {
        }
    }
}

