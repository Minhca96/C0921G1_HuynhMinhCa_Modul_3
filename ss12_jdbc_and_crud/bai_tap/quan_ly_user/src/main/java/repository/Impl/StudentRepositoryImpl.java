package repository.Impl;

import bean.Student;
import repository.IStudentRepository;

import java.sql.Connection;
import java.util.List;

public class StudentRepositoryImpl implements IStudentRepository {
  private String url="jdbc:mysql://localhost:3306/user_khach_hang";
  private String user="root";
  private String password="01021996";

  public Connection getDBConnect(){


  }



    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void search() {

    }

    @Override
    public void sort() {

    }
}
