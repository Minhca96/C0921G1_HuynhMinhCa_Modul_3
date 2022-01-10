package service.impl;

import bean.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements IStudentService {

    // DI
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return this.iStudentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Map<String, String> save(Student student) {

        // key: ten item, value: message loi
        Map<String, String> messageMap = new HashMap<>();

        if (!student.getName().matches("[A-Za-z ]+")) {
            messageMap.put("name", "Invalid name format");
        }

        if ("".equals(student.getDateOfBirth())) {
            messageMap.put("dateOfBirth", "Please input date of birth");
        }

        if (messageMap.isEmpty()) {
            this.iStudentRepository.save(student);
        }

        return messageMap;
    }

    @Override
    public String callTransaction() {
        return this.iStudentRepository.callTransaction();
    }

    @Override
    public List<Student> findByKeyword(String keyword) {
        return this.iStudentRepository.findByKeyword(keyword);
    }
}
