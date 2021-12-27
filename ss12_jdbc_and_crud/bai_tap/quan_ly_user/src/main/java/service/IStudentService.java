package service;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Integer id);
    void save(Student student);
    void search();
    void sort();
}
