package March_1.SecondAssignment;

public class CountDigits {

    static void  main(){
        System.out.println("Start");
        int number =1234;
        System.out.println(countDigit(number)+" present in number : "+ number);
        System.out.println("End");
    }

    /*
 2. Write a method to count the number of digits in an integer value n. Assume that n is
nonnegative and represented in base ten.
  */
    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        } else {

            int count = 1 + countDigit(n / 10);
            return count;
        }
    }
}
