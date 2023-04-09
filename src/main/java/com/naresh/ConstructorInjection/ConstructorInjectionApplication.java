package com.naresh.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConstructorInjectionApplication implements CommandLineRunner {

	private final UserService userService;
@Autowired
	public ConstructorInjectionApplication( @Qualifier("ConstructorInjectionApplication")UserService userService) {
		this.userService = userService;
	System.out.println("constructor based dependency injection");
	}

	public static void main(String[] args) {

		SpringApplication.run(ConstructorInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userService.getMessage());
	}
}
