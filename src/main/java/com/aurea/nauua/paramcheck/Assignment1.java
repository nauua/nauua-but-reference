package com.aurea.nauua.paramcheck;

import java.util.Objects;

public class Assignment1 {

	public String name;

	public Assignment1() {
	}

	public Assignment1(String stringVal) {
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
}
