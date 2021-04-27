// 

/*
multi-line breaks
I will use this sandbox project to document interesting findings that dont fit 
    into the test
I will also summarise everything that I'll learn
*/


import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // print *sout tab*
        System.out.println("message");
        
        // userinput
        Scanner scan = new Scanner(System.in);
        System.out.println("input your message here: "); String message = scan.nextLine();
        System.out.println(message);
        
        // conversion of string to int
        int num = Integer.valueOf("2") ;
        
        // double result of two integers in an operation
        int first_num = 3;
        int second_num = 2;
        System.out.println(first_num/second_num); // 1
        System.out.println(first_num/second_num*1.0); //1.0
        System.out.println(first_num/(second_num*1.0)); //1.5
        System.out.println((double) first_num/second_num); //1.5
        
        Scanner testScan = new Scanner("[1,2,3]").useDelimiter(",");
        while (testScan.hasNext()) {
            if (testScan.hasNextInt()) {
                
            }
        }
        
    }
}
