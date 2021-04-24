
public class AdvancedAstrology {

    public static void printStars(int number) {     //
// public static String Stars(int number) {
        String stars = "";
        for (int i=1; i<=number;i++) {
            stars+="*";
        }
        System.out.println(stars);                  //
        // return stars;
    }

    public static void printSpaces(int number) {    //
// public static String Spaces(int number) {
        String spaces = "";
        for (int i=1; i<=number;i++) {
            spaces += " ";
        }
        System.out.println(spaces);                 //
        // return spaces;
        
    }

    public static void printTriangle(int size) {
        for (int i=1;i<=size;i++) {
            String spaces = "";                     //
            for (int j=1; j<=size-i;j++) {          //
                spaces += " ";                      //
            }                                       //
            String stars = "";                      //
            for (int k=1; k<=1+(i-1)*2;k++) {       //
                stars+="*";                         //
            }                                       //
            System.out.println(spaces+stars);       //
            // System.out.println(Spaces(size-i)+Stars(1+(i-1)*2));
        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);
        for (int i=1;i<=2;i++) {                    //
            String spaces = "";                     //
            for (int j=1;j<=height-2;j++) {         //
                spaces+= " ";                       //
            }                                       //
            String stars = "";                      //
            for (int k=1;k<=3;k++) {                //  
                stars+= "*";                        //
            }                                       //
            System.out.println(spaces+stars);       //
        }                                           //
        // System.out.println(Spaces(height-2)+Stars(3)); 
        // System.out.println(Spaces(height-2)+Stars(3)); 
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
