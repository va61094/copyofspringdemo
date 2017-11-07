package com.dao;

import java.sql.Connection;

import org.springframework.stereotype.Component;
@Component("o")
public class OracleDs implements DB{
	public Connection connect(){
		System.out.println("Oracle");
		return null;
	}

}
