
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int prod = 1;
        
        System.out.println("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        for (int i=n; i>0; i--) {
            prod *= i ;
        }
        System.out.println("Factorial: "+prod);
        
    }
}
