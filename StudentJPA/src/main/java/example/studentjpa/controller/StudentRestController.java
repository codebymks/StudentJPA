package example.studentjpa.controller;

import example.studentjpa.model.Student;
import example.studentjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/listOfStudents")
    public List<Student> getStudents() {
        var obj = studentRepository.findAll();
        return obj;
    }
}
