package com.ashay.petprojects.fizzbuzz;

import com.ashay.petprojects.fizzbuzz.replacers.NumberReplacer;

public interface FizzBuzzNumberPrinter {
	public String print();
	public void addReplacer(NumberReplacer replacer);
}
