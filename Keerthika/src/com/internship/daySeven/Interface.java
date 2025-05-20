package com.internship.daySeven;

interface Rentable {
	void displayDetails();
	double calculateRental(int days) throws InvalidRentalException;
}

