package service.Impl;

import bean.Student;
import repository.ISRepository;
import repository.Impl.SRepositoryImpl;
import service.ISService;

import java.util.List;

public class SServiceImpl implements ISService {
    ISRepository isRepository =new SRepositoryImpl();
    @Override
    public List<Student> FindAll() {
        return isRepository.FindAll();
    }

    @Override
    public void add(Student student) {
        isRepository.add(student);

    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
