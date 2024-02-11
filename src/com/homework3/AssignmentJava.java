package com.homework3;

public class AssignmentJava {

	public static void main(String[] args) {
		// Assignment Operators
		// assigning x value to y using = (assignment operator)
		//create variables
		int x = 10;
		int y = x;
		
		System.out.println(y); //y is 10.
		
		 // create variables
	    int a = 4;
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += a;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= a;
	    System.out.println("var using *=: " + var);
	    
	    //answer will be 
//	    10
//	    var using =: 4
//	    var using +=: 8
//	    var using *=: 32

	}

}
