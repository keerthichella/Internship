package com.internship.daySeven;

import java.util.Arrays;

class InvalidRentalException extends Exception{
	@Override
	public String toString() {
		return null;
	}

	public InvalidRentalException() {
		super();
	}

	public InvalidRentalException (String message) {
		
		super(message);
	}
}
