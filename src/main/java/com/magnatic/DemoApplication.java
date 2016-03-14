package com.magnatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	String one = "1";
	public static void main(String[] args) throws RuntimeException{

		ConfigurableApplicationContext run =
				SpringApplication.run(DemoApplication.class, args);
	}
}
