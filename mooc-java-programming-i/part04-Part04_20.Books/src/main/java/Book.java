/**
 *
 * @author sherv
 */
public class Book {
    private String name;
    private int pages;
    private int year;
    
    public Book(String name, int pages, int year) {
        this.name = name ;
        this.year = year ;
        this.pages = pages ;
    }
    
    public String toString() {
        return this.name +", "+ this.pages +" pages, "+ this.year ;
    }
    
    public String getName() {
        return this.name ;
    }
    
    public int getYear() {
        return this.year ;
    }
    
    public int getPages() {
        return this.pages ;
    }
    
}
