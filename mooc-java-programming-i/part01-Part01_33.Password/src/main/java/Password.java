
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pwd = "Caput Draconis";
        
        System.out.println("Number 2 is even.");
        String input = scan.nextLine();
        
        if (input.equals(pwd)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
