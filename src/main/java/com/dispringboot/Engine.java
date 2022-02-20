package com.dispringboot;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String description;
	
	public Engine(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	
	
}
