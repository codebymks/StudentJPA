package example.studentjpa.config;

import example.studentjpa.model.Student;
import example.studentjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalTime;


public class initData implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student();
        student1.setName("John");
        student1.setBirthDate(LocalDate.of(1990, 1, 1));
        student1.setBirthTime(LocalTime.of(12, 0,12));

        studentRepository.save(student1);
    }
}
