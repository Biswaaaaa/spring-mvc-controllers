package com.oreilly.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringMvcControllersApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcControllersApplication.class, args);
	}

}
