
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        boolean found = false;
        System.out.println("Search for? ");
        String find = scanner.nextLine();
        for (String name : list) {
            if (name.equals(find)) {
                System.out.println(find+" was found!");
                found = true ;
                break;
            }
        }
        if (!found) {
            System.out.println(find+ " was not found!");
        }
    }
}
