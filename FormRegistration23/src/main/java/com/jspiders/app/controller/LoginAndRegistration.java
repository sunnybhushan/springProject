package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginAndRegistration
{
	

	@RequestMapping(value="/")
	String home()
	{
		System.out.println("student");
		return "dashboard";
	}
	
	@RequestMapping(value="/SignUp")
	String SignUp()
	{
		System.out.println("student");
		return "registration";
	}
	
	@RequestMapping(value="/SignIn")
	String SignIn()
	{
		System.out.println("Login");
		return "signin";
	}
	
	
}
