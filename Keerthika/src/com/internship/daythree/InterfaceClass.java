package com.internship.daythree;

public class InterfaceClass implements InterfaceOne ,InterfaceTwo{
	
	public void display() {
		System.out.println("Display Method");
	}
	
	
	public void print() {
		System.out.println("Print Method");
	}
	public static void main(String[]args) {
		
		InterfaceClass i= new InterfaceClass();
		i.display();
		i.print();
	}
	

}
