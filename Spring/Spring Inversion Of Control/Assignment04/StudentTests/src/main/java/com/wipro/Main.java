package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentBean.xml");
		Student s1 = context.getBean("student1", Student.class);
		Student s2 = context.getBean("student2", Student.class);
		s1.display();
		s2.display();
	}

}
