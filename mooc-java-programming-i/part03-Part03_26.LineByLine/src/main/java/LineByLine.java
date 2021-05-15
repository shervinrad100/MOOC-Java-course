
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        while (!line.equals("")) {
            String[] words = line.split(" ") ;
            for (String word : words) {
                System.out.println(word);
            }
        line = scanner.nextLine() ;
        }
        

    }
}
