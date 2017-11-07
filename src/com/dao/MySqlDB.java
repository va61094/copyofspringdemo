package com.dao;

import java.sql.Connection;

import org.springframework.stereotype.Component;
@Component("m")
public class MySqlDB implements DB{
	
	public Connection connect(){
		System.out.println("MySQL");
		return null;
	}

}
