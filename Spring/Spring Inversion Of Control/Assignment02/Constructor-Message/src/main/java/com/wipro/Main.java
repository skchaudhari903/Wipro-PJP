package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cmsgBean.xml");
		ConstructorMessage cmsg = context.getBean(ConstructorMessage.class);
		System.out.println(cmsg.getMessage());
	}

}
