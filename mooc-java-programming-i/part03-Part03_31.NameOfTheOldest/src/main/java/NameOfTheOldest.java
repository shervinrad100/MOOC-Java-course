
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        int oldest = 0;
        String name = "";
        while (!line.equals("")) {
            String[] words = line.split(",");
            int age = Integer.valueOf(words[1]);
            if (age > oldest) {
                oldest = age;
                name = words[0];
            }
            line = scanner.nextLine();
        }
        System.out.println("Name of the oldest: "+name);


    }
}
