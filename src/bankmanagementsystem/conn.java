
package bankmanagementsystem;
import java.sql.*;

 
public class conn  {
    Statement stmt;
    Connection con;
     conn()
     {
         try
         {
             //load driver
       Class.forName("com.mysql.jdbc.Driver");
       //create connection
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","8001@sameer");
       //create statement
       
       stmt= con.createStatement();
       
         
         }
         catch(Exception e)
         {
             System.out.println(e);
             
         }
         
         
             
       
         
         
     }
}
