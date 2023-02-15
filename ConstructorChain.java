package com.java.constructor.day6;

public class ConstructorChain {

	ConstructorChain(float a) {
		System.out.println("This is float");
	}

	ConstructorChain(int b) {
		System.out.println("This is int");
	}

	ConstructorChain() {
		System.out.println("this is no args");
	}

	public static void main(String[] args) {

		ConstructorChain chain = new ConstructorChain(10.0f);
	}
}
