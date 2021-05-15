
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"} ;
        String[] password = {"sunshine", "haskell"} ;
        
        System.out.println("Enter username: ");
        String user = scanner.nextLine() ;
        System.out.println("Enter password: ");
        String pwd = scanner.nextLine() ;
        
        if ((user.equals(username[0]) && pwd.equals(password[0])) || 
                (user.equals(username[1]) && pwd.equals(password[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
