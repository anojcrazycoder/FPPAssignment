package Feb_25;

/*
Problem – 4
Create a class Prog4. Inside its main method, create float variables to store each of the following
numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as a
 */
public class Prog4 {
    float num1 = 1.27f;
    float num2 = 3.881f;
    float num3 = 9.6f;
    //1. the sum of the floats as an integer, obtained by casting the sum to type int
    // (int)(num1+num2);

    public  int castFloatToInt(){
        //1. the sum of the floats as an integer, obtained by casting the sum to type int
        return (int)(num1+num2);
    }

    public  int RoundFloatToInt(){
        return  Math.round(num1+num2);
    }
}
