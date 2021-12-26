package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private String url = "jdbc:mysql://localhost:3306/student1";
    private  String user = "root";
    private String password = "01021996";
    public Connection getDBconnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

//    public static void main(String[] args) {
//        DBConnect dbConnect = new DBConnect();
//        System.out.println(dbConnect.getDBconnect());
//    }
}
