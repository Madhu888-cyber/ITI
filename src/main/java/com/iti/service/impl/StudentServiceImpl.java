package com.iti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iti.model.Student;
import com.iti.repository.StudentRepository;
import com.iti.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repository;

	@Override
	public void saveStudent(Student student) {
		repository.save(student);
	}
}
