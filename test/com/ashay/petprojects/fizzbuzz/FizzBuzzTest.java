package com.ashay.petprojects.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ashay.petprojects.fizzbuzz.replacers.Buzzer;
import com.ashay.petprojects.fizzbuzz.replacers.Fizzer;

public class FizzBuzzTest {
	
	 FizzBuzzNumberPrinter fizzBuzzNumberPrinter;
	
	@Before
	public void setUp(){
		fizzBuzzNumberPrinter=new FizzBuzzNumberPrinterImpl();
		fizzBuzzNumberPrinter.addReplacer(new Fizzer());
		fizzBuzzNumberPrinter.addReplacer(new Buzzer());
	}
	
	@Test
	public void testUptoFifteenForFizzBuzz() {
		FizzBuzzNumberPrinter fizzBuzzNumberPrinter=new FizzBuzzNumberPrinterImpl();
		assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz", fizzBuzzNumberPrinter.print());
	}

}
