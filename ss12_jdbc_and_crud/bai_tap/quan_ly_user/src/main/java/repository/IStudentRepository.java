package repository;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    Student findById(Integer id);
    void save(Student student);
    void search();
    void sort();

}
