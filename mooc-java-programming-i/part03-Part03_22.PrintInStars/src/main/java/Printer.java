
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int numberOfStars : array) {
        //    System.out.println("*".repeat(numberOfStars));
            int i = 0;
            String str = "";
            while (i<numberOfStars) {
                str += "*" ;
                i++ ;
            }
            System.out.println(str);
        }
    }

}
