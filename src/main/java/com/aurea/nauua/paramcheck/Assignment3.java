package com.aurea.nauua.paramcheck;

public class Assignment3 {

	public void compareValue(int input, double inputDouble) {
		if (inputDouble > 100 || inputDouble < 50) {
			throw new IllegalArgumentException("message");
		}
	}

	public void compareAndValue(int input, float inputDouble) {
		if (inputDouble < 100 && inputDouble > 50) {
			throw new IllegalArgumentException("message");
		}
	}

	public void compareAndValue(int input, double inputDouble) {
		if (inputDouble < 100 && inputDouble > 50) {
			throw new IllegalArgumentException("message");
		}
	}

	public static void compareValue(int input, String output) {
		if (input > 100 || input < 50) {
			throw new IllegalArgumentException("message");
		}
	}
}
