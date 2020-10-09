package com.wipro;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playerBean.xml");
		Player p1 = context.getBean("player1", Player.class);
		Player p2 = context.getBean("player2", Player.class);
		Player p3 = context.getBean("player3", Player.class);
		Player p4 = context.getBean("player4", Player.class);
		Player p5 = context.getBean("player5", Player.class);

		Scanner sc = new Scanner(System.in);
		System.out.println("Show players from which country? \n (1) India \n (2) Australia \n->");
		int countryCode = sc.nextInt();
		String countryName = countryCode == 2? "Australia" : "India";
		
		Player[] players = {p1, p2, p3, p4, p5};
		
		for (Player p : players) {
			if (p.getCountry().getCountryName().equals(countryName))
				p.display();
		}
	}
}
