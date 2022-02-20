package com.dispringboot;

import org.springframework.stereotype.Component;

@Component
public class HybridEngine extends Engine {
	
	public HybridEngine(String description) {
		super(description);
	}
	@Override
	public String getDescription() {
		return "HYBRID " + super.getDescription();
	}
	
	
	
}
