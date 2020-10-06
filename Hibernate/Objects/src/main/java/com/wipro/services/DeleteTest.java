package com.wipro.services;

import com.wipro.bean.Flower;
import com.wipro.dao.FlowerDAO;

public class DeleteTest {

	public static void main(String[] args) {
		FlowerDAO fldao = new FlowerDAO();
		Flower flobj = fldao.getFlower("1");
		System.out.println("Deleting : ");
		System.out.println(flobj);
		System.out.println(fldao.deleteFlower("1"));
		System.out.println("Trying to delete again");
		System.out.println(fldao.deleteFlower("1"));
	}

}
