package com.dispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiSpringBootApplication {
	
	public static void main(String[] args) {
	//	SpringApplication.run(DiSpringBootApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
		Car car = ctx.getBean(Car.class);
		System.out.println(car);
	}

}
