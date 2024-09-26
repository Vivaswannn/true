package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
	Student s=ctx.getBean(Student.class);
	System.out.println(s);
}
}