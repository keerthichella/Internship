package com.internship.daysix;

public class MainClass {
	public static void main(String[] args) {
		BankAcount account=new BankAcount();
		try {
			account.deposit(500);
			}catch(InvalidAmountException e) {
			System.out.println("Transaction error:"+e.getMessage());
		}
		account.displayBalance();
	}
}



































