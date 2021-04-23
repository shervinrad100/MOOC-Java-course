
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());
            if (in == 0) {
                break ;
            } else {
                sum += in;
                count ++ ;
            }
        }
        double avg = sum/count ;
        System.out.println("Average of the numbers: "+avg);
    }
}
