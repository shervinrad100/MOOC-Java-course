


//when you start a program it executes the main method which has to belong to a class which we call Main

/* later we will learn about modules and package relations. If module is your DB, 
* packages are your schemas
* classes are your tables
* objects are the entries
* methods are system functions that you write to do things to entries in your tables
*/

//access modifier: public private etc

//our base package is called default package because we didn't create file paths

package com.sherv.javatutorials.lesson1;

public class Main {
	
	public static void main(String[] args) { // your main method must always be static
		System.out.println("Hello World"); // using System class, out field, println (print line) method
		byte number = 30;
		int ytViews = 123_456_789; // you can use _ to make it more readable
		int bigytViews = 3_123_456_789; //read the error
		long bigytViews = 3_123_456_789; // read the error
		long bigytViews = 3_123_456_789L; //because java still reads it as int so we specify it with a suffix again
		float price = 10.99; // read error
		float price = 10.99F; 
		System.out.println(number);
	}
}

/* 
 * to run outside of eclipse, you need to export the packages etc
*/