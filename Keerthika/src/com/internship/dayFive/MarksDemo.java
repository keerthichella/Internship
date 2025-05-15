package com.internship.dayFive;

public class MarksDemo {
	public static void main(String[] args) {
		int[] marks= {85,90,78,92,88};
		try { 
			System.out.println("Mark of sixth student:" +marks[5]);	
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception caught:"+e.getMessage());
		System.out.println("you tried access an invalid array:");
	}finally {
		System.out.println("Program finishing students marks:");
		
	}
	}

}
