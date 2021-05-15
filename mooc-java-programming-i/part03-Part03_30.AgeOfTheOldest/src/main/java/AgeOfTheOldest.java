
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        int oldest = 0;
        while (!line.equals("")) {
            String[] words = line.split(",");
            int age = Integer.valueOf(words[1]);
            if (age > oldest) {
                oldest = age;
            }
            line = scanner.nextLine();
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
