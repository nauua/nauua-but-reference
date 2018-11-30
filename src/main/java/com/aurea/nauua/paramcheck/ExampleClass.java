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
	
	public static void assignNewValue2(String input) {
		Objects.requireNonNull(input);
	}
	
	
	public void test2() {
		this.name = "Nasir2";
	}
}
