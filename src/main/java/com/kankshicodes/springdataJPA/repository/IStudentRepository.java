package com.kankshicodes.springdataJPA.repository;

import com.kankshicodes.springdataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * This is the interface that extends the Jpa repository
 */
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

    // @Query("select s from Student s where s.name=?1")
    List<Student> findByName(String name);

    List<Student> findByMarks(Integer marks);
}
