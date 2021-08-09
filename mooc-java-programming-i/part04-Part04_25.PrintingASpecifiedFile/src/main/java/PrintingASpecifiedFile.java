
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed? ");
        String fileName = scanner.nextLine() ;
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
