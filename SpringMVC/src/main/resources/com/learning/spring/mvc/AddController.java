package com.learning.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	/*@RequestMapping("/add")
	public void add() 
	{
		System.out.println("Controller Invoked");
	}*/
	
	/*@RequestMapping("/add")
	public String add() 
	{
		return "display.jsp";
	}*/
	
	/*@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) 
	{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		int sum  = i + j;  				
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", sum);              //set object label and data
		
		return mv;
	}*/
	
	/*@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) 
	{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();         //business logic in another class
		int sum = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");                //remove .jsp suffix
		mv.addObject("result", sum);              
		
		return mv;
	}*/
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) 
	{
		AddService as = new AddService();         
		int sum = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");                
		mv.addObject("result", sum);              
		
		return mv;
	}
}
