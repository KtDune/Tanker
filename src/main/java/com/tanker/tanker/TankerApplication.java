package com.tanker.tanker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TankerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TankerApplication.class, args);
		System.out.println("Working!!!");
	}

}
