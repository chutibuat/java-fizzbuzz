package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    public String convert(int input) {
		if(input%15 == 0) return "FizzBuzz";
		if(input%5 == 0) return "Buzz";
		if(input%3 == 0 ) return "Fizz";
		return Integer.toString(input);
    }
}
