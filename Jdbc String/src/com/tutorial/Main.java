package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

          
//        Databaseinfo di = (Databaseinfo)conx.getBean("dbi");
	     
//		int ins = di.insertPerson(new Person("Youcef","Essa",32,"Iraq",330608602));
        
//		System.out.println(ins);
        
        System.out.println("ok");
	}

}
