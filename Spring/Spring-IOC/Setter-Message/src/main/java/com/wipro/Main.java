package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("smsgBean.xml");
		SetterMessage smsg = context.getBean(SetterMessage.class);
		System.out.println(smsg.getMessage());
	}

}
