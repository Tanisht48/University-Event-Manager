package com.Geekster.University.Event.Management.Service;

import com.Geekster.University.Event.Management.Model.Department;
import com.Geekster.University.Event.Management.Model.Student;
import com.Geekster.University.Event.Management.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;
    public String addAStudent(Student s) {
        studentRepo.save(s);

        return "Student added !!!";
    }

    public String addStudents(List<Student> s) {

        studentRepo.saveAll(s);

        return "Students added !!!";
    }

    public Iterable<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    public String updateStudentDepartment(Integer id, Department department) {
        Optional<Student> s = studentRepo.findById(id);

       if(s.isEmpty()){return "Student id not found!!!";}

        Student stu = s.get();
        stu.setStudentDepartment(department);
        studentRepo.save(stu);
        return  "Id updated";
    }

    public String removeStudentById(Integer id) {

       Student e = studentRepo.findById(id).orElse(null);
        if(e==null)
        {
            return "Id not found";
        }
        studentRepo.delete(e);

        return "Student Removed";
    }
}
