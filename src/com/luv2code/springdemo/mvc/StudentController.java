package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showModel(Model theModel)
	{
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		System.out.println(" FirstName " + theStudent.getFirstName() + " LastName " + theStudent.getLastName());
		
		String FirstName = theStudent.getFirstName();
		String LastName = theStudent.getLastName();
		
		
		return "student-confirmation";
	}
}
