
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper = Integer.valueOf(scanner.nextLine());
        
        for (int index = 0; index < upper+1; index++) {
            System.out.println(index);
        }
    }
}
