package com.internship.daythree;

public class ChildClass extends ParentClass{
	@Override
	int add(int a, int b) {	
		System.out.println("Child Class");
		return a+b;
	}
	@Override
	int add(int a) {
		System.out.println("Child Class");
		return a;
		
	}
	@Override
	float add(float a, float b) {
		System.out.println("Child Class");
		return a+b;
		
	}
	@Override
	float add(int a, float b) {
		System.out.println("Child Class");
		return a+b;
	}
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		ParentClass p=new ParentClass();
		System.out.println(c.add(22,23));
		System.out.println(p.add(23,27));
	}

}
