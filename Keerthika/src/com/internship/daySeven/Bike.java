package com.internship.daySeven;

class Bike extends vehicle {
	
	private int engineCC;
	private double helmetRentalFee;
	
public Bike(int vehicleId,String model,double baseRate, int engineCC, double helmetRentalFee) {
	
	
	super();
	
	this.engineCC=engineCC;
	this.helmetRentalFee=helmetRentalFee;
	}

public double calculateRental(int days)throws InvalidRentalException{
	if(days<=0)throw new InvalidRentalException("Rental days must be grater than zero");
	return getBaseRate()*days+helmetRentalFee;
}
public void displayDetails() {
	super.displayDetails();
	System.out.println("Engine CC:"+engineCC);
}
}
	
	
	
	
	












