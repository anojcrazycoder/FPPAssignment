package March_1.ThirdAssignment;

public class ArraySum {


    public static void main(String[] args) {

        System.out.println("Start");
        int[] input = {2,4,5,6,2};
        System.out.println("Sum of array elements is "+sumOfArrayElements(input));
        System.out.println("End");
    }

    /*
3. Write a method to compute the sum of all elements of the array arr, of size n.
 */
    public static int sumOfArrayElements(int[] arr) {

        if (arr.length <= 0) {
            return 0;
        } else {
            int[] subArray = new int[ arr.length - 1];
            System.arraycopy(arr, 1, subArray, 0, arr.length - 1);
            int sum = sumOfArrayElements(subArray) + arr[0];
            return sum;
        }
    }
}
