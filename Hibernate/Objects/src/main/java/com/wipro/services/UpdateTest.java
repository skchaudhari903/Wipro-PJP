package com.wipro.services;

import java.util.Scanner;

import com.wipro.bean.Flower;
import com.wipro.dao.FlowerDAO;

public class UpdateTest {

	public static void main(String[] args) {
		FlowerDAO fldao = new FlowerDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id > ");
		String id = sc.next();
		Flower flobj = fldao.getFlower(id);
		System.out.println();
		System.out.println("Current Flower : " + flobj);
		System.out.println();
		System.out.print("Enter Price > ");
		int price = sc.nextInt();
		flobj.setPrice(price);
		System.out.println(fldao.updateFlower(flobj));
		System.out.println("Updated Flower : " + flobj);
		sc.close();
	}

}
