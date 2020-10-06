package com.wipro.services;

import com.wipro.bean.Flower;
import com.wipro.dao.FlowerDAO;

public class DisplayTest {

	public static void main(String[] args) {
		FlowerDAO fldao = new FlowerDAO();
		Flower flobj = fldao.getFlower("2");
		System.out.println(flobj);
	}

}
