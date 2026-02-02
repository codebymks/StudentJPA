package example.studentjpa.model;

import example.studentjpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void test() {
        List<Student> students = studentRepository.findAll();
        assertEquals(1, students.size());

    }
}