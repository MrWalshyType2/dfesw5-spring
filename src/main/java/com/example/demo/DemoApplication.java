package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// gets the ApplicationContext object
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
	
		// Method name is the name of the Bean method
		// - "Hello Bean" is the actual Bean retrieved
		String s = ac.getBean("iAmABean").toString();
		System.out.println(s);
		
	}

}
