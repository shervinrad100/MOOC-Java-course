
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine() ;
        double sumOfAge = 0;
        int numNames = 0;
        int longestLen = 0;
        String name = "";
        
        while (!line.equals("")) {
            
            String[] words = line.split(",");
            sumOfAge += Integer.valueOf(words[1]) ;
            int nameLen = words[0].length() ;
            
            if ( nameLen> longestLen) {
                longestLen = nameLen ;
                name = words[0] ;
            }
            numNames ++ ;
            line = scanner.nextLine() ;
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(double) sumOfAge/numNames);
    }
}
