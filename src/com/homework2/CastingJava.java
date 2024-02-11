package com.homework2;

public class CastingJava {

	public static void main(String[] args) {
		// Widening − Converting a lower datatype to a higher datatype is known as widening. 
		
	// assigning 12.01 to double variable m.
	 int m =(int) 12.01;
	 
	 double n =   (int) m; // convert double m  value to int and assign it to n 
	 double total = (m+n);
	 System.out.println(total); //answer is 24.0
	}

}
