package com.ashay.petprojects.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import com.ashay.petprojects.fizzbuzz.replacers.NumberReplacer;

public class FizzBuzzNumberPrinterImpl implements FizzBuzzNumberPrinter {

	List<NumberReplacer> replacers;

	public FizzBuzzNumberPrinterImpl() {
		replacers = new ArrayList<NumberReplacer>();
	}

	@Override
	public String print() {
		String toPrint = "";
		for (int i = 1; i < 100; i++) {
			toPrint = toPrint + iterateOverReplacers(i)+" ";
		}
		return toPrint;
	}

	private String iterateOverReplacers(int i) {
		String toSend = "";
		for (NumberReplacer replacer : replacers) {
			toSend = toSend + replacer.getReplacementForNumber(i);
		}
		return toSend;
	}

	@Override
	public void addReplacer(NumberReplacer replacer) {
		replacers.add(replacer);
	}

}
