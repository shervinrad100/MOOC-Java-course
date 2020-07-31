/*
 * Java's System.out.printf function can be used to print formatted output. 

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, 
and each integer will be in the inclusive range from 0 to 999.
Sample Input

java 100
cpp 65
python 50

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; 
if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 
 Sample Output

================================
java           100 
cpp            065 
python         050 
================================

 */


package Introduction;

import java.util.*;

public class OutputFormatting {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String[] line = scan.nextLine().split(" ");
			System.out.println(line[0]+" ".repeat(15-line[0].length())+String.format("%03d",Integer.parseInt(line[1])));
		
		/* Best practice:
		 *  String s = scan.next();
		 *  int n = scan.nextInt();
		 */
		}
		scan.close();

	}
}
