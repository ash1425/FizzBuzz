package com.ashay.petprojects.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ashay.petprojects.fizzbuzz.replacers.Buzzer;
import com.ashay.petprojects.fizzbuzz.replacers.NumberReplacer;

public class BuzzTester {

	@Test
	public void testIfMulipleOfFive() {
		NumberReplacer buzzer = new Buzzer();
		assertEquals("buzz", buzzer.getReplacementForNumber(5));
	}

	@Test
	public void testNotMulipleOfFive() {
		NumberReplacer buzzer=new Buzzer();
		assertEquals("4", buzzer.getReplacementForNumber(4));
	}

}
