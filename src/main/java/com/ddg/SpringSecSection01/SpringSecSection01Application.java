package com.ddg.SpringSecSection01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//This is required if I create the controller package outside my main package.
//@ComponentScan("com.ddg.SpringSecSection01.controller")
public class SpringSecSection01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecSection01Application.class, args);

	}

}
