import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in) ;
        ArrayList<Book> catalog = new ArrayList<>() ;
        
        while (true) {
            
            System.out.println("Title: ");
            String name = scan.nextLine() ;
            
            if (name.isEmpty()) {
                break ;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine()) ;
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine()) ;
            
            catalog.add(new Book(name, pages, year)) ;            
        }
        
        System.out.println("What information will be printed? ");
        String info = scan.nextLine() ;
        
        if (info.equals("everything")) {
            for (Book book:catalog) {
                System.out.println(book);
            }
        } else if (info.equals("name")) {
            for (Book book:catalog) {
                System.out.println(book.getName());
            }
        } 

    }
}
