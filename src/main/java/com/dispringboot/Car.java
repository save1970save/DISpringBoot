package com.dispringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine; 
	
	// comme
	
	public String toString () {
		return "CAR with " + engine.getDescription() + " Engine";
	}
}
