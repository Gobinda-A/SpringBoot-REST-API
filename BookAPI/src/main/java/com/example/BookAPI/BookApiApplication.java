package com.example.BookAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BookApiApplication.class, args);
		System.out.println("Running SpringBoot Server.....");
	}

}
