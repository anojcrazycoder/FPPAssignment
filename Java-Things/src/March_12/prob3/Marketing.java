package March_12.prob3;

import java.util.ArrayList;

public class Marketing {

    //employeename, productname, and
    //salesamount
    private String employeename;
    private  String productname;
    private  double salesAmount;
    public  Marketing(String employeename,String productname,double salesAmount){
        this.employeename = employeename;
        this.productname = productname;
        this.salesAmount = salesAmount;
    }

    @Override
    public  String toString(){
        return  "{Employee Name : '"+employeename + '\''+
                ",Product Name : '"+productname+'\''+
                "Sales Amount : "+salesAmount;


    }

    public static void main(String[] args) {
        ArrayList<Marketing> lst = new ArrayList<>();
        lst.add(new Marketing("Anoj Shrestha","Prod-1",333));
        lst.add(new Marketing("Prakriti Shrestha","Prod-2",44));
        lst.add(new Marketing("Shana Raut","Prod-3",56));
        //remove
        Marketing obj = new Marketing("Anoj Shrestha","Prod-1",333);
        lst.remove(obj);

        for(Marketing o : lst){
            System.out.println(o);
        }

        //Size of the list
        int sizeOfList = lst.size();

        //Override -> toString()

    }
}
