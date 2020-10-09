package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.dao.CouponDao;

@Controller
public class CouponController {

	@Autowired
	CouponDao dao;

	@RequestMapping(value = "/congratulations", method = RequestMethod.GET)
	public String congratulations() {
		return "congratulations";
	}
}