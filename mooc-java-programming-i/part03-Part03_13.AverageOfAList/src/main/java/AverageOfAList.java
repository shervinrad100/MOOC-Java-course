
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        ArrayList<Integer> nums = new ArrayList<>() ;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            nums.add(input);
        }
        
        for (int num:nums) {
            sum += num ;
        }
        System.out.println("Average: "+ (double) sum/nums.size());        
    }
}
