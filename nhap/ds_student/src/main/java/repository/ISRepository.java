package repository;

import bean.Student;

import java.util.List;

public interface ISRepository {
    List<Student> FindAll();
     void add(Student student);
      Student findById(int id);
}
