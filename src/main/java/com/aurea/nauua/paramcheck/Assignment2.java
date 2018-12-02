package com.aurea.nauua.paramcheck;

public class Assignment2 {

	// method with single parameter with null on left side
	public void method1(String input) {
		if (null == input) {
			throw new IllegalArgumentException("message");
		}
	}

	// method with single parameter with null on right side
	public void method2(String input) {
		if (input == null) {
			throw new IllegalArgumentException("message");
		}
	}

	// method with multiple parameter with null check on one of them
	public void method3(String input2, String input) {
		if (null == input) {
			throw new IllegalArgumentException("message");
		}
	}
}
