package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Marks;

@Controller
public class MarksController {
	@RequestMapping("PreInsertMarks")
	public ModelAndView preInsert() {
		Marks marks = new Marks();
		ModelAndView mv = new ModelAndView("InsertMarks", "marks", marks);
		return mv;
	}

	@RequestMapping("InsertMarks")
	public ModelAndView insertMarks(@ModelAttribute("Marks") Marks marks) {
		ModelAndView mv = new ModelAndView("result", "marks", marks);
		return mv;
	}
}
