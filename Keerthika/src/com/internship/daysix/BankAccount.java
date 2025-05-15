package com.internship.daysix;

public class BankAccount extends MainClass {
	private int accno;
	private double balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + "]";
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accno, double balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	void deposit(int amount) throws InvalidAmountException {
		if(balance>amount) {
			throw new InvalidAmountException("InvalidAmountException");
			}
			
		else {
			balance=balance+amount;
		}
		}
	void withdraw(int amount) throws InsufficientFundException {
		if(balance<amount) {
			throw new InsufficientFundException("InsufficientFundException");
		}
		else {
			balance=balance-amount;
		}
	}
	void displayBalance() {
		System.out.println("My current balance is:"+balance);
		
	}
	
}

