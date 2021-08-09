
import java.util.Scanner;

public class Cubes {

    static int cubed(int num) {
            int ans = num ;
            for (int pow = 1; pow <3; pow ++) {
                ans *= num ;
            }
            return ans ;
        }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break ;
            } else {
                System.out.println(cubed(Integer.valueOf(input)));
            }
        }
    }
}
