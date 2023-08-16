package com.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5MinutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn5MinutesApplication.class, args);
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[] { 12, 23 }, 3);
		System.out.println(result);
	}

}
