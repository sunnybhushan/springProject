package com.jspiders.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.Studentdao;
import com.jspider.dto.StudentDto;

@Controller
public class StudentController 
{	
	@Autowired
	Studentdao dao;
//	
//	@RequestMapping(value="/student")
//	String Registration(@ModelAttribute StudentDto student, Model m)
//	{
//		m.addAttribute("std",student);
//		System.out.println(student);
//		return "registrationOne";
//	}
	@RequestMapping(value="/registra")
	String studentResgistration(@ModelAttribute StudentDto student, BindingResult result)
	{
		if(result.hasErrors())
		{
			return("registration");
		}
		int id=dao.saveStudent(student);
		System.out.println(id);
		return("registrationOne");
	}

	
	/*
	 * @RequestMapping(value="/student",method=RequestMethod.POST) String
	 * dummy(StudentDto student,ModelMap m) { System.out.println(student);
	 * 
	 * 
	 * m.addAttribute("reg", "SignUp successfully"); m.addAttribute("rega",
	 * student); return "registrationOne";
	 * 
	 * }
	 */
	
}
