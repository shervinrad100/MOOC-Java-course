
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        while (!line.equals("")) {
            
            System.out.println(line.split(" ")[0]);
            
            line = scanner.nextLine() ;
        }

    }
}
