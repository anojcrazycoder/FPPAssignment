package Feb_25;

public class Prog6 {
    public  int findMinimumInteger(int[] arrayOfInts)
    {
        int min =arrayOfInts[0];
        for(int a : arrayOfInts){
            if(a<min){
                min = a;
            }
        }
        return  min;
    }
}
