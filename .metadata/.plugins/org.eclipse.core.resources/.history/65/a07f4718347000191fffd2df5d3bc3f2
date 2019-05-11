package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{
	
	/*
	 * @RequestMapping(value="/") String sayHello() { return "dashboard"; }
	 */
	 
	@RequestMapping(value="/")
	String sun()
	{
		System.out.println("student");
		return "dummyPage";
	}
	
	@RequestMapping(value="/update")
	String update(Model m)
	{
		m.addAttribute("update", "File updated sunny");
		System.out.println("Update");
		return "dashboard";
	}
	
	@RequestMapping(value="/delete")
	String delete()
	{
		System.out.println("delete");
		return "dashboard";
	}
	
	@RequestMapping(value="/student")
	String dummy(StudentDao student)
	{
		System.out.println(student);
		return "dummyPage";
	}
	
	
}



