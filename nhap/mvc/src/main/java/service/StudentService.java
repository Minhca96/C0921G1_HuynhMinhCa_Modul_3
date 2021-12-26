package service;

import connect.DBConnect;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        String query = "SELECT * FROM student";
        try {
            conn = new DBConnect().getDBconnect();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                studentList.add(new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age")));
            }

        }catch (Exception e){
            e.getMessage();
        }
        return  studentList;
    }


}
