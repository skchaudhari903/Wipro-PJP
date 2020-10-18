package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView("Hello");
		String msg = "Hello World";
		mv.addObject("message", msg);
		return mv;
	}
}
