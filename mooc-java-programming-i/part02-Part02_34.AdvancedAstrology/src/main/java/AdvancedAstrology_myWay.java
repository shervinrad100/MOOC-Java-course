
public class AdvancedAstrology_myWay {

    public static String Stars(int number) {
        String stars = "";
        for (int i=1; i<=number;i++) {
            stars+="*";
        }
        return stars;
    }

    public static String Spaces(int number) {
        String spaces = "";
        for (int i=1; i<=number;i++) {
            spaces += " ";
        }
        return spaces;
        
    }

    public static void printTriangle(int size) {
        for (int i=1;i<=size;i++) {
            System.out.println(Spaces(size-i)+Stars(1+(i-1)*2));
        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);
        System.out.println(Spaces(height-2)+Stars(3)); 
        System.out.println(Spaces(height-2)+Stars(3)); 
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
        
    }
}
