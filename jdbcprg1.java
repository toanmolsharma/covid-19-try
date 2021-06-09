import java.sql.*;
 
public class jdbcprg1 {
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    
    public jdbcprg1()
    {
        try
        {
            Class.forName("com.mysql.Jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]","root","root");
               stmt=con.createStatement();
            
        } catch(Exception e)
        {
            System.out.println("error"+e);
        }
    }
    
    public void getData()
    {
          try
          {     
              
              String  query ="Select * from Login";
              
              rs=stmt.executeQuery(query);
              System.out.println("record from database");
                while(rs.next())
                {
                    String email=rs.getString("email");
                    String password=rs.getString("password");
                    System.out.println("email:    "+email+"  "+"password:   "+password);
                }
              
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
          
    
     }
    
    public static void  main(String args[])
    {
        jdbcprg1 c = new jdbcprg1();
        c.getData();
    }   
}
