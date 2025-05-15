package com.qtech.internship.dayone;

public class Mark {
	int tamil=90;
	int english=89;
	int maths=77;
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "Mark [tamil=" + tamil + ", english=" + english + ", maths=" + maths + "]";
	}
	

}
