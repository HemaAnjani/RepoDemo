package com.demon.courseswebapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("courses")
	/* @ResponseBody */    //we use this if we want the specific data to be printed
	public ModelAndView courses(@RequestParam("cname") String coursename)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		return mv;
	} 

}
