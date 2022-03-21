package com.iti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iti.model.Student;
import com.iti.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping("/student_registration_step1")
	public String showReg(Model model) {
		model.addAttribute("student", new Student());
		return "student_registration_step1";
	}
	@RequestMapping(value="/student_forgot_registration_form", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student,Model model) {
		service.saveStudent(student);
		model.addAttribute("student", new Student());
		return "student_forgot_registration_form";
	}
	
	

}
