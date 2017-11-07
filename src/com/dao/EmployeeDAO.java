package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ed")
public class EmployeeDAO {
	DB b;
	@Autowired
	public EmployeeDAO(@Qualifier("o")DB b) {
		// TODO Auto-generated method stub
		this.b=b;
		
	}
	 public void display(){
		
		 b.connect();
		
	}

}
