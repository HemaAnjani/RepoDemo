package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/* @RequestMapping(value="/") */
public class App {
	
	/*
	 * @RequestMapping(value="/",method=RequestMethod.GET) public String display() {
	 * return "index"; }
	 */
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String display() {
		return "hello";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String displayyy() {
		return "welcome";
	}
}
