package com.ashay.petprojects.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ashay.petprojects.fizzbuzz.replacers.Fizzer;
import com.ashay.petprojects.fizzbuzz.replacers.NumberReplacer;

public class FizzTester {

	@Test
	public void testForMultipleOfThree() {
		NumberReplacer fizzer=new Fizzer();
		assertEquals("fizz", fizzer.getReplacementForNumber(3));
	}
	
	@Test
	public void testWhenNotMulipleOfThree(){
		NumberReplacer fizzer=new Fizzer();
		assertEquals("2", fizzer.getReplacementForNumber(2));
	}

}
