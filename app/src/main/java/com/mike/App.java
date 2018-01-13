package com.mike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.kastkode.springsandwich.filter", "com.mike"})
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		 SpringApplication.run(App.class, args);
	}
}
