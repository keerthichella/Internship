package com.internship.daytwo;

public class ConstructorOverloading {
	//default constructor
	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	int ConstructorOverloading(int a, int b) {
		return a+b;
	}
	int ConstructorOverloading(int a) {
		return a;
	}
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		c.ConstructorOverloading(34);
		c.ConstructorOverloading(23,34);
	}
}
