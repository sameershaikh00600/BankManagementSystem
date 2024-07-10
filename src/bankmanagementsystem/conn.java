
package bankmanagementsystem;
import java.sql.*;

 
public class conn  {
    Statement stmt;
    Connection con;
     conn()
     {
         try
         {
       Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","8001@sameer");
       stmt= con.createStatement();
       
         
         }
         catch(Exception e)
         {
             System.out.println(e);
             
         }
         
         
             
       
         
         
     }
}
