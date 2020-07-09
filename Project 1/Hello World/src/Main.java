// when you start a program it executes the main method which has to belong to a class which we call Main

/* later we will learn about modules and package relations. If module is your DB, 
 * packages are your schemas
 * classes are your tables
 * objects are the entries
 * methods are system functions that you write to do things to entries in your tables
*/

// access modifier: public private etc

// our base package is called default package because we didn't create file paths

//package (default package);

public class Main {
	public void main(String[] args) {
		System.out.println("Hello World"); // using System class, out field, println (print line) method
	}
}
