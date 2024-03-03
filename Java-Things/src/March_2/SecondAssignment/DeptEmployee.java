package March_2.SecondAssignment;

import java.time.LocalDate;

public class DeptEmployee {
    private  String name;
    private LocalDate hireDate;
    public  DeptEmployee(String name, LocalDate hireDate){
        this.name = name;
        this.hireDate = hireDate;
    }
    public  String getName(){
        return  name;
    }
    public  LocalDate getHireDate(){
        return  hireDate;
    }
    public  double computeSalary(){

        return  0.0;
    }
}
