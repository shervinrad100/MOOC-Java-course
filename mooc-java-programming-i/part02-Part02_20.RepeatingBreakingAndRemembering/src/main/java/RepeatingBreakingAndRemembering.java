
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int evenNums = 0;
        int oddNums = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break ;
            } else {
                sum += num ;
                count ++ ;
                if (num%2==0) {
                    evenNums ++;
                } else {
                    oddNums ++;
                }
            }
        }
        
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+ ((double) sum/count));
        System.out.println("Even: "+evenNums);
        System.out.println("Odd: "+oddNums);
    }
}
