package com.aurea.nauua.paramcheck;

import java.util.Objects;

public class ExampleClass {

	public String name;
	
	public ExampleClass() {}
	
	public ExampleClass(String stringVal) {
		this.name = Objects.requireNonNull(stringVal);
	}
	
	public void assignNewValue(String input) {
		Objects.requireNonNull(input);
		this.name = "Nasir";
	}
	
	public void assignNewValue2(String input) {
		Objects.requireNonNull(input);
	}
	
	
	public void requireNotNullOnSecondLine(String input) {
		this.name = "Nasir2";
		Objects.requireNonNull(input);
	}

	public void requireNotNullAbsent(String input) {
		this.name = "Nasir2";
	}
}
