package March_1.FirstAssignment;

public class ReverseDigits {
    static void main(String[] args){
        System.out.println("Start");
        printReverseDigits(4562);
        System.out.println("End");
    }

    /*
1. Write a method to display the digits of a given integer value n in reverse order
 */
    public static void printReverseDigits(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println( n % 10);
            printReverseDigits(n/10);
        }
    }
}
