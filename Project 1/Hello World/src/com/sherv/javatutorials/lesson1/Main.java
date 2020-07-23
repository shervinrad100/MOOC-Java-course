


//when you start a program it executes the main method which has to belong to a class which we call Main

/* later we will learn about modules and package relations. 
* If module is your DB, 
* packages are your schemas
* classes are your tables
* objects are the entries
* methods are system functions that you write to do things to entries in your tables
*/

//access modifier: public private etc

//our base package is called default package because we didn't create file paths

package com.sherv.javatutorials.lesson1;

import java.util.Date;
import java.awt.*;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) { // your main method must always be static
		
		System.out.println("Hello World"); // using System class, out field, println (print line) method
		
		// specifying variables 
		byte number = 30;
		int ytViews = 123_456_789; // you can use _ to make it more readable
//		int bigytViews = 3_123_456_789; //read the error
//		long bigytViews = 3_123_456_789; // read the error
		long bigytViews = 3_123_456_789L; //because java still reads it as int so we specify it with a suffix again
//		float price = 10.99; // read error
		float price = 10.99F; 
		System.out.println(number);
		
		// primitive (you dont need to allocate memory) for storing simple values
		//and reference (you need to allocate memory) types fr storing objects
		// new operator: allocate memory
		Date now = new Date(); // an instance of a class of type Date called now is created anew of type Date()
		System.out.println(now.getTime());
		
		
		// mutability of primitive and reference types
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println(y);
		
		Point point1 = new Point(1, 1);
		Point point2 = point1;
		point1.x = 0;
		point1.y = 0;
		System.out.println(point2);
		
		// strings are reference types in java
		String message = "Hello world"; // you can do this way called literall string
		String Mess = new String("Hello World");
		System.out.println(Mess+ " , "+ message);
		
		// let's check out some of the methods of the string class
		System.out.println(Mess.endsWith("!"));
		System.out.println(Mess.length());
		System.out.println(Mess.indexOf("H")); // indexes start at 0
		System.out.println(Mess.indexOf("!")); // you get -1 meaning invalid 

		// parameters are inputs we define for our function and arguments are the values we pass to them 
		System.out.println(Mess.replace("Hello", "Goodbye")); // it returns a new string. Strings are immutable
		// Mess.trim is the same as strip() in python 
		// Mess.toLowerCase() is the same as .lower or .upper in python 
		
		// special characters in strings 
		String Message = "\" \n \tMy Quote\" ";
		System.out.println(Message);
		
		// we also escape backslashes eg \\
		// \n is new line
		// \t is tab
		
		// ARRAYS
		// old method of initialising arrays
/*		
*		int[] numbers = new int[3]; // you specify the length of the array in the bracket and then you populate the list as you go
*		numbers[0] = 1;
*		numbers[1] = 2;
*		numbers[2] = 3;
*/
		
		// better method:
		int[] numbers = {2,1,3};
		System.out.println(numbers.length);
		
		// once you create an array, you cant add or remove items
		Arrays.sort(numbers);
		
		// you cant use println to read the array. it will only show you the memory location
		// you use a method from the java.util.Array class
		System.out.println(Arrays.toString(numbers));
		
		int[][] matrix = new int[2][3];
		System.out.println(Arrays.deepToString(matrix));
		
		// adding final to primitive values makes them immutable eg
		final float PI = 3.14F; // use capitals to illustrate constants
		// pi = 1; // read error
		
		
		// IN JAVA DEVISION OF TWO WHOLE NUMBERS IS A WHOLE NUMBER
		//int result = 10 / 3; 
		// what you do is you cast the ouput as another Dtype eg
		//double result = 10/3; // check error, because 10 and 3 are still ints
		double result = (double)10/3;
		System.out.println(result);
		
		int X = 1;
		X++; // x =1+1
		System.out.println(X);
		++X; // x = 1+2
		System.out.println(X); // x = 3
		int Y = X++; // is Y = 4 or 3?
		System.out.println(Y + "=y and"+X+"=x"); // Y = 3 and X = 4
		int Y2 = ++X; // is Y = 4 or 5?
		System.out.println(Y2 + "=y and"+X+"=x"); // y= 5 and x= 5
		
		// you can also do += ...
		// you can parse strings to their specific Dtypes using their classes 
		// Integer.parseInt("1") pass a string as an argument which has the number you wanna parse

		System.out.println(Math.round(1.1F));
		// you also have ceil/floor/max/min etc methods random gives a Math.random double between 0 and 1
		
		
		
		// abstract classes cannot be instantiated because theyre like a half baked cake
		//NumberFormat currency = new NumberFormat();
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String currency_result = currency.format(1234567.891);
		System.out.println(currency_result);
		String percentage = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(percentage);
		
		
		// user inputs		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		byte age_in = scanner.nextByte();
		System.out.println("You are "+age_in+" yrs old");
		
		System.out.print("name: ");
		String name_ = scanner.next().trim(); // next only gives you the next token, next line gives you all of users input
		System.out.println("Nice to meet you "+ name_);
		
		
		
		// Flow Control 
		short temp = 22;
		boolean isWarm = temp > 20 && temp < 30; // && -> AND
		System.out.println(isWarm); // gives true
		
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true; 
		boolean isCriminal = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !isCriminal; // || -> OR, ! -> NOT
		
		
		// IF statement
		int temp_ = 32;
		if (temp_ > 30) {
			System.out.println("hot");
		} else if (temp_ > 20) {
			System.out.println("warm");
		} else {
			System.out.println("cold");
		}
		
		//
		int income_ = 120_000;
		boolean hasHighIncome_ = (income_>100_000); // if logical expression is true then hasHighIncome_ = True, else false 
		
		//
		String classname = (income_ >100_000) ? "first" : "economy"; // if condition is true first else economy
		
		// SWITCH STATEMENT 
		String role = "admin";
		switch (role) {
			case "admin":
				System.out.println("youre admin");
				break;
			case "moderator":
				System.out.println("youre moderator");
				break;
			default:
				System.out.println("youre guest");
		}
		
		// FOR LOOP
		for (int i = 0; i < 5; i++) {
			System.out.println("for iteration "+i);
		}
		
		// WHILE LOOP
		int i_ = 5;
		while (i_>0) {
			System.out.println("While iteration "+i_);
			i_--;
		}
		
		
		// since strings are reference types you cant say while (object != "string") you have to use .equals
		String input ="";
		while (!input.equals("quit")) {
			System.out.println("input: ");
			input = scanner.next().toLowerCase();
		}
		System.out.println("terminated");
		
		// DO WHILE LOOPS
		// you do the code once, and after that if the condition is not met again it will break
		do {
			System.out.println("input: ");
			input = scanner.next().toLowerCase();
		} while (!input.equals("quit"));
		
		// break: breaks loop
		//continue: go to beginning of loop
		//pass: do nothing
		
		// FOR EACH LOOPS - iterate over arrays
		// method one: index
		String[] letters = {"a", "b", "c"};
		for (int i = 0; i<letters.length; i++) {
			System.out.println(letters[i]);
		}
		// value reference
		for (String letter : letters) {
			System.out.println(letter);
		}
		
		scanner.close(); // close to avoid leaks and terminate your programme 

	}
}

/* 
 * to run outside of eclipse, you need to export the packages etc
*/