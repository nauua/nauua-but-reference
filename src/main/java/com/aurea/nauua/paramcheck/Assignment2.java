package com.aurea.nauua.paramcheck;

import java.util.Objects;

public class Assignment2 {
	
	// method with 
	public void method1(String input) {
		if (null == input) {
			throw new IllegalArgumentException("message");
		}
	}
	
	public void method2(String input2, String input) {
		if (null == input) {
			throw new IllegalArgumentException("message");
		}
	}
}
