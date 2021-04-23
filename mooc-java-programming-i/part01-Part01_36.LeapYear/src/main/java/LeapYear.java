
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        String msg1 = "The year is not a leap year.";
        String msg2 = "The year is a leap year.";
        
        if (year%4 != 0) {
            System.out.println(msg1);
        } else if (year%100 == 0) {
            if (year%400 == 0) {
                System.out.println(msg2);
            } else {
                System.out.println(msg1);
            }
        } else {
            System.out.println(msg2);
        }
    }
}
