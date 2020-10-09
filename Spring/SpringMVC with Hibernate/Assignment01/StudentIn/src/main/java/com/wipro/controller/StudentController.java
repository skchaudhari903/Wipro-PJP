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

	@RequestMapping("PreInsertStudent")
	public ModelAndView preInsert() {
		Student student = new Student();
		student.setStudentid(dao.getStudentId());
		ModelAndView mv = new ModelAndView("InsertStudent", "student", student);
		return mv;
	}

	@RequestMapping("InsertStudent")
	public ModelAndView InsertStudent(@ModelAttribute("student") Student stu) {
		ModelAndView mv = new ModelAndView("result", "student", stu);
		if (dao.insertStudent(stu))
			mv.addObject("msg", "Inserted Successfully");
		else
			mv.addObject("msg", "Insert Failed");
		return mv;
	}
}
