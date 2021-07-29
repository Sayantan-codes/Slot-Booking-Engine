import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sayan
 */
public class MyConnection {
    //creating a connection
 public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin?autoReconnect=true&useSSL=false","sayantan","Barcelona15**");
            //System.out.println("Connection Successfull");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
 
    }
