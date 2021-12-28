package service;

import bean.Student;

import java.util.List;

public interface ISService {
    List<Student> FindAll();
    void add(Student student);
    Student findById(int id);
}
