package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao dao;

	@RequestMapping("PreViewStudent")
	public ModelAndView preView() {
		Student student = new Student();
		student.setStudentid(dao.getStudentId());
		ModelAndView mv = new ModelAndView("ViewStudent", "student", student);
		return mv;
	}

	@RequestMapping("ViewStudent")
	public ModelAndView ViewStudent(@ModelAttribute("student") Student stu) {
		ModelAndView mv = new ModelAndView("result", "student", stu);
		if (dao.viewStudent(stu))
			mv.addObject("msg", "Viewed Successfully");
		else
			mv.addObject("msg", "Viewed Failed");
		return mv;
	}
}
