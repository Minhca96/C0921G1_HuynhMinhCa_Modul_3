package service;

import connect.DBConnect;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    Connection cn= null;
    PreparedStatement ps= null;
    ResultSet rs=null;

    public List<Student> getAllStudent(){
      List<Student> studentList = new ArrayList<>();
      String query = "SELECT * FROM student1.student";
      try {
            cn=  new DBConnect().getDBConnect();
            ps =cn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                studentList.add( new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return studentList;

    }

}
