package com.example.JavaAlg;

public class StackEmptyException extends Exception {
	String errorMessage;

	public StackEmptyException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String toString() {
		return errorMessage;

	}
}
