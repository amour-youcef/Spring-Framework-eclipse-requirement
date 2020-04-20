package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext conx = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person p = (Person) conx.getBean("p1");
 		p.display();

		System.out.println("youcef");
	}
}
