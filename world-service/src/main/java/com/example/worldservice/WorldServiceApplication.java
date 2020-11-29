package com.example.worldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldServiceApplication.class, args);
	}

}
