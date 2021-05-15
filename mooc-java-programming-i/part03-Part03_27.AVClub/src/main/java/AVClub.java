
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        while (!line.equals("")) {
            
            String[] words = line.split(" ");
            for (String word : words) {
                /*
                String[] letters = word.split("") ;
                for (int i=0; i<letters.length-2; i++) {
                    if (letters[i].equals("a")) {
                        if (letters[i+1].equals("v")) {
                            System.out.println(word);
                        }
                    }
                }
                */
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
            
            
            line = scanner.nextLine() ;
        }

    }
}
