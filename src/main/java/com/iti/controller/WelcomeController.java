package com.iti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/home")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/student_registration_step1")
	public String showReg() {
		return "student_registration_step1";
	}
	@RequestMapping("/apply_for_iti")
	public String Iti_Apply() {
		return "apply_for_iti";
	}
	@RequestMapping("student_registration_edit")
	public String student_edit_form() {
		return "student_registration_edit";
	}
	@RequestMapping("/student_forgot_registration_form")
	public String student_registration_form() {
		return "student_forgot_registration_form";
	}
	

}
