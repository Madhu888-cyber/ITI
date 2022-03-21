package com.iti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iti.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
