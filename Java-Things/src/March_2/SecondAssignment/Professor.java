package March_2.SecondAssignment;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private  int numberOfPublications;
    public Professor(String name, LocalDate hireDate,int numberOfPublications){
        super(name,hireDate);
        this.numberOfPublications = numberOfPublications;
    }
    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public double computeSalary() {
        // Salary includes a base amount plus a bonus for each publication
        double baseSalary = 50000; //Assume basic salary is 50k
        double publicationBonus = 1000; //Assume publicationBonus is 1k
        return baseSalary + (numberOfPublications * publicationBonus);
    }
}
