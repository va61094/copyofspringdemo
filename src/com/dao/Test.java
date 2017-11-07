package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDAO ed=(EmployeeDAO)ac.getBean("ed");
		ed.display();
	}

}
