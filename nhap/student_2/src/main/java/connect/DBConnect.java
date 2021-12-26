package connect;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
     String url="jdbc:mysql://localhost:3306/student1";

     String name= "root";
     String password= "01021996";

    public Connection getDBConnect()  {

        try {
               Class.forName("com.mysql.jdbc.Driver");
               return DriverManager.getConnection(url,name,password);
           }catch ( ClassNotFoundException ex){
               ex.getStackTrace();
           } catch (SQLException throwables) {
               throwables.printStackTrace();
           }


        return null;
    }

    public static void main(String[] args) {
        DBConnect dbConnect= new DBConnect();
        System.out.println(dbConnect.getDBConnect());

    }


}
