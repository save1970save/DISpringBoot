package com.dispringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
	
	@Bean
    public Engine getEngine() {
		return new HybridEngine("2000cc");
	}
	
	@Bean
	public Car getCar() {
		return new Car();
	}
	
}
