package com.ashay.petprojects.fizzbuzz.replacers;

public class Fizzer implements NumberReplacer {

	@Override
	public String getReplacementForNumber(int number) {
		if(number%3==0)
			return "fizz";
		else
			return number+"";
	}

}
