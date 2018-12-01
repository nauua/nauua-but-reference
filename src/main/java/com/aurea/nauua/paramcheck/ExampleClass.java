package com.aurea.nauua.paramcheck;

import java.util.Objects;

public class ExampleClass {

	public String name;

	public ExampleClass() {
	}

	public ExampleClass(String stringVal) {
		this.name = Objects.requireNonNull(stringVal);
	}

	// single param instance method
	public void method1(String input) {
		Objects.requireNonNull(input);
		this.name = "Nasir";
	}

	// single param static method
	public static void method2(String input) {
		Objects.requireNonNull(input);
	}
	
	// multiple param instance method
	public void method1(String input, String input2) {
		Objects.requireNonNull(input);
		this.name = "Nasir";
	}

	// multiple param static method
	public static void method2(String input, String input2) {
		Objects.requireNonNull(input);
	}
	
	// discard this method
	public void method0() {
		this.name = "Nasir2";
	}

	// discard this method
	public void method01() {
		this.name = "Nasir2";
	}

}
