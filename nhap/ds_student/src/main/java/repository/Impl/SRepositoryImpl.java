package repository.Impl;

import bean.Student;
import repository.ISRepository;

import java.util.ArrayList;
import java.util.List;

public class SRepositoryImpl implements ISRepository {
   static List<Student> studentList= new ArrayList<>();

    static {
        studentList.add(new Student(1,"ca",25));
        studentList.add(new Student(2,"tai",20));
        studentList.add(new Student(3,"huyen",30));
    }
    @Override
    public List<Student> FindAll() {
        return new ArrayList<>(studentList);
    }

    @Override
    public void add(Student student) {
        studentList.add(student);

    }

    @Override
    public Student findById(int id) {
        return null;
    }

}
