
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // assign the input to an object called "message" 
        String message = scanner.nextLine();
        
        // print the message
        System.out.println(message);
    }
}
