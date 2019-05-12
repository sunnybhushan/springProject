package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Studentdao;
import com.dto.Student;

@Controller
public class StudentController
{

	@Autowired
	Studentdao dao;

	@RequestMapping("/login")
	ModelAndView login(@RequestParam(name = "studentName") String name,
			@RequestParam(name = "password") String password, ModelMap model) 
	{
		System.out.println("login called");
		System.out.println(name);
		System.out.println(password);

		// will send data to the page called
		model.addAttribute("userName", name);
		model.addAttribute("pwd", password);
		return new ModelAndView("data.jsp");

	}

	ModelAndView login11(String name, String password) 
	{
		System.out.println(name);
		System.out.println(password);
		return new ModelAndView("data.jsp");
	}

	@RequestMapping(value = "/studentDetails", method = RequestMethod.POST)
	String studentDeyaits(@ModelAttribute Student student, BindingResult result) 
	{

		if (result.hasErrors())
		{
			return ("AddStudent");
		}

		int id = dao.saveStudent(student);
		System.out.println(id);

		return ("StudentDetails");
	}

	@RequestMapping(value = "/")
	String studentDeyaits()
	{
		return "AddStudent";
	}

}




