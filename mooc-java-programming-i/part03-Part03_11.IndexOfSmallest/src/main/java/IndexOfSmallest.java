
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<>() ;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            nums.add(input);
        }
        
        int smallest = nums.get(0);
        int index = 0;
        for (int i =0;i<nums.size();i++) {
            if (nums.get(i) < smallest) {
                smallest = nums.get(i) ;
                index = i;
            }
        }
        System.out.println("Smallest number: "+smallest);
        System.out.println("Found at index: "+index);  
    }
}
