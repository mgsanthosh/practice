package com.example.firstProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);

		/*
		@Author Santhosh
		We have to tell spring that Alien.class is a bean, to create and instance of that object
		 */
		Alien alien = context.getBean(Alien.class);
		alien.show();
	}

}
