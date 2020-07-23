/*
 * In this challenge, you must read  integers from stdin and then print them to stdout. 
 * Each integer must be entered and printed on a new line.
 */

package Introduction;

import java.util.*;

public class in_out {
	public static void main(String[] args) {
		
		// take input in one line
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("int: ");
		String[] input = scan.nextLine().strip().split(" ");
		*/
		
		// take input on different lines
		String[] input = new String[3]; // you can also have int[] and later scan.nextInt()
		for (int i = 0; i < 3; i++) {
			System.out.print("items["+i+"]: ");
			input[i] = scan.nextLine().strip();
		}
		
		// if you want them to be integers
		int[] list = new int[3];
		for (int i = 0; i < input.length; i++) {
			list[i] = Integer.parseInt(input[i]);
		}

		// print on seperate lines
		System.out.println(Arrays.toString(input));
		for (int item: list) {
			System.out.println(item);
		}
		scan.close();
	}
} 

