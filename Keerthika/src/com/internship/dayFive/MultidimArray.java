package com.internship.dayFive;

public class MultidimArray {
	public static void main(String[] args) {
		int[][] array= {{5,10,15},{20,25,30}};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
		}
		System.out.println("Array elements:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println(array[i][j]+" ");
			}
				
			}
		System.out.println("Sum of all elements:"+sum);
		
	}
		}
