package March_12.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Marketing {
    private String employeeName;
    private  String productName;
    private  double salesAmount;
    public  Marketing(String employeeName,String productName,double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }
    public  String getEmployeeName(){
        return  employeeName;
    }
    public  String getProductName(){
        return  productName;
    }
    public  double getSalesAmount(){
        return  salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(marketing.salesAmount, salesAmount) == 0 &&
                employeeName.equals(marketing.employeeName) &&
                productName.equals(marketing.productName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }

    public static void main(String[] args) {
        ArrayList<Marketing> lst = new ArrayList<>();
        //a. Add objects to the Marketing list
        lst.add(new Marketing("Anoj Shrestha","Prod-1",1500));
        lst.add(new Marketing("Prakriti Shrestha","Prod-2",2500));
        lst.add(new Marketing("Bikul Raut","Prod-3",2300));
        //b. remove an object from Marketing List
        lst.remove(new Marketing("Anoj Shrestha","Prod-1",333));

        //c. Print the size of the list
        System.out.println("Size of the list: "+lst.size());

        //d. Override toString() method to display the contents in the list
        //e. Override the equals() method
        // f. Sort the list in natural order for the field salesamount using comparator interface
        lst.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
            }
        });

        // g. Sort the list in natural order using employeename with the criteria of salesAmount > 1000
        List<Marketing> filteredList = listMoreThan1000(lst);
        filteredList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return m1.getEmployeeName().compareTo(m2.getEmployeeName());
            }
        });

        // Print the sorted list
        System.out.println("Sorted list:");
        for (Marketing marketing : filteredList) {
            System.out.println(marketing);
        }
    }

    // e. Override the equals() method

    // g. Write a method to retrieve the result of getting list of employees have more than $1000 sales.
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }



}
