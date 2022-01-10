package service;

import bean.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Integer id);
    Map<String, String> save(Student student);
    String callTransaction();
    List<Student> findByKeyword(String keyword);
}
