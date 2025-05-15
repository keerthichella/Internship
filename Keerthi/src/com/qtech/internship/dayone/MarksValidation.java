package com.qtech.internship.dayone;

import java.util.Scanner;

public class MarksValidation {
	public static void validateMarks(int marks)throws IllegalArgumentException {
		if(marks<0 || marks>100) {
			throw new IllegalArgumentException ("Marks should be between 0 to 100.");
		}
		else {
			System.out.println("Marks entered:"+marks);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter the students marks (0 to 100):");
			int marks=scanner.nextInt();
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid input:"+ e.getMessage());
		}finally {
			System.out.println("Marks processing completed.");
			
		}
		}
}
			