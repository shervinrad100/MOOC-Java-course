
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = scanner.nextLine() ;
        String str = "";
        //System.out.println(word.repeat(3));
        for (int i =0; i<3;i++) {
            str += word ;
        }
        System.out.println(str);
    }
}
