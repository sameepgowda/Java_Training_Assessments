package com.org.autotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con =new ClassPathXmlApplicationContext("applicationContext.xml");

AOneClass a1 = con.getBean(AOneClass.class);
a1.display();

	}

}
