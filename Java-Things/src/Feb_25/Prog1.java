package Feb_25;
/*
Problem – 1
Create a class called Prog1. In the main method of the class, output to the console the result
of doing the following two computations:
1. get a random number x in the range 1 .. 9 and compute πx
.
2. get a random number y in the range 3 .. 14 and compute y
π
.
Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not
use the Random class directly.) Use Math API to solve πx
and y
π
 */

public class Prog1 {

    // Method to compute πx
    public   double computePiX() {
        // Generate a random number x in the range 1..9
        int x = RandomNumbers.getRandomInt(1, 9);

        // Return the result of the computation
        return Math.PI * x;
    }

    // Method to compute yπ
    public  double computeYPi() {
        // Generate a random number y in the range 3..14
        int y = RandomNumbers.getRandomInt(3, 14);
        // Return the result of the computation
        return y * Math.PI;
    }
}
