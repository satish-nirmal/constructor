package com.java.constructor;

public class Student {

	String name;
	int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Satish", 101);
		
		System.err.println(s1.name + " " + s1.id);
	}
}
