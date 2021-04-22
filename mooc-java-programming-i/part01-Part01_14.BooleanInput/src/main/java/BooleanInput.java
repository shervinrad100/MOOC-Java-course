
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println("Write something:");
        
        boolean boolz = Boolean.valueOf(input);
        System.out.println("True or false? "+ boolz);
        

    }
}
