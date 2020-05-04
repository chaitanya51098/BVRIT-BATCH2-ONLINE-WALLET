package com.capg.onlinewallet;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
		System.out.println("Spring Boot Application started..");
	}

}
