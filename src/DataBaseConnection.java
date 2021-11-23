

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DataBaseConnection {
    
    final static String JDBC_Driver = "com.mysql.jdbc.Driver";
    final static String jb_url = "jdbc:mysql://localhost:3306/Student";
    final static String USER="root";
    final static String PASS="";
    
    public static Connection connection()
    {
        try
        {
            Class.forName(JDBC_Driver);
            Connection conn=DriverManager.getConnection(jb_url,USER,PASS);
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    } 
}
    