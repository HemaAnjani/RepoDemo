package com.demo.springbootDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDiApplication {

	public static void main(String[] args) {
		//to return obj at runtime
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootDiApplication.class, args);
	    Customers c=context.getBean(Customers.class);
	    c.display();
	}

}
