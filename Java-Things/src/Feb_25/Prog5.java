package Feb_25;

   /*
    Problem – 5
Create a class Prog5 and implement the given method which takes the two arrays of inputs
and combine the two arrays into single array.
public int[] combine(int[] a, int[] b);
Example: Input array a : [5,6,-4,3,1]
Input array b: [ 3,8,9,11]
Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
     */

import java.util.Arrays;

public class Prog5 {

    public   int[] combine(int[] a, int[] b){
        int[] single = new int[a.length+b.length];
         System.arraycopy(a,0,single,0,a.length);
         System.arraycopy(b,0,single,a.length,b.length);
         return  single;
    }
}
