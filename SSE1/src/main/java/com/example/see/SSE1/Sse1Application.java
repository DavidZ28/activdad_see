package com.example.see.SSE1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sse1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sse1Application.class, args);
	}

}
