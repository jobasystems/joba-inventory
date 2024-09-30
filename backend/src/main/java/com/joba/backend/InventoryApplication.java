package com.joba.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}
}
