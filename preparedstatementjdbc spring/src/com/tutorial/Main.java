package com.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ApplicationContext conx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
        Databaseinfo di = (Databaseinfo)conx.getBean("dbi");
	    
          di.insertPerson(new Person("Youcefp","Essap",32,"Iraqp",330608602));
        
//        Person p = new Person();
        
//        p.setId(4);
//        
//        int ins = di.deletePerson(p);
        
//      p.setId(2);
      
//      int ins = di.updatePerson(new Person(2,"YoucefU","UEssa",32,"UIraq",330608602));
//        
//		System.out.println(ins);
        
		
        System.out.println("ok");
	}

}
