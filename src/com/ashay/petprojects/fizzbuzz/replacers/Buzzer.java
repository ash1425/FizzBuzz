package com.ashay.petprojects.fizzbuzz.replacers;


public class Buzzer implements NumberReplacer {

	@Override
	public String getReplacementForNumber(int number) {
		if (number % 5 == 0)
			return "buzz";
		else
			return number + "";
	}

}
