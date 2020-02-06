package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void Input_1_Should_be_1() {
		String expected = "1";
		int input = 1;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}
	@Test
	public void Input_2_Should_be_2() {
		String expected = "2";
		int input = 2;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_3_Should_be_Fizz() {
		String expected = "Fizz";
		int input = 3;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_4_Should_be_4() {
		String expected = "4";
		int input = 4;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_5_Should_be_5() {
		String expected = "Buzz";
		int input = 5;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_15_Should_be_15() {
		String expected = "FizzBuzz";
		int input = 15;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_150_Should_be_150() {
		String expected = "FizzBuzz";
		int input = 150;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_100_Should_be_100() {
		String expected = "Buzz";
		int input = 100;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}

	@Test
	public void Input_99_Should_be_99() {
		String expected = "Fizz";
		int input = 99;

		DemoApplication fizzBuzz = new DemoApplication();
		String actual = fizzBuzz.convert(input);
		assertEquals(expected, actual);
	}
}
