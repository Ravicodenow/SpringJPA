package com.kankshicodes.springdataJPA;

import com.kankshicodes.springdataJPA.model.Student;
import com.kankshicodes.springdataJPA.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringdataJpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringdataJpaApplication.class, args);
        IStudentRepository iStudentRepository = context.getBean(IStudentRepository.class);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setName("Ravi Kumar");
        s1.setMarks(99);
        s1.setRollnumber(1);

        s2.setMarks(100);
        s2.setRollnumber(2);
        s3.setName("Rohit Singh");

        s3.setRollnumber(3);
        s3.setName("Krishna Kumar Mishra");
        s3.setMarks(12050);

//        iStudentRepository.save(s1);
//        iStudentRepository.save(s2);
//        iStudentRepository.save(s3);
        System.out.println(iStudentRepository.findAll());
        System.out.println(iStudentRepository.findById(2));

        Optional<Student> s = iStudentRepository.findById(3);
        System.out.println(s);

        System.out.println(iStudentRepository.findByName("Ravi Kumar"));
        System.out.println(iStudentRepository.findByMarks(100));

        iStudentRepository.delete(s2);


    }

}
