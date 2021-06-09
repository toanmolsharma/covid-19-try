
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;


public class log {
       public static void main(String[] args) {
  
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println("Where is your MySQL JDBC Driver?");
        return;
    }

    System.out.println("MySQL JDBC Driver Registered!");
           Object Connection = null;

   
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]","root", "root");

   
        System.out.println("Connection Failed! Check output console");
        e.printStackTrace();
        return;
    

    if (connection != null) {
        System.out.println("You made it, take control your database now!");
    } else {
        System.out.println("Failed to make connection!");
    }
}
}
