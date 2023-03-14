package com.example.Acceptance.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcceptanceTaskApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcceptanceTaskApplication.class, args);
		System.out.println("""

				All people from database:   http://localhost
				Person by id 1:             http://localhost/1
								
				""");
	}
}
