package com.example.springsecsection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans({@ComponentScan("com.example.springsecsection2.Controller"), @ComponentScan("com.example.springsecsection2.Config")})
public class Springsecsection2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecsection2Application.class, args);
	}

}
