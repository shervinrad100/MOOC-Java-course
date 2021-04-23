
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upper = Integer.valueOf(scanner.nextLine());
        int lower = Integer.valueOf(scanner.nextLine());
        for (int i=lower; i<=upper; i++) {
            System.out.println(i);
        }
    }
}
