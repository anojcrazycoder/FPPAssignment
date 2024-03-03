package March_2.SecondAssignment;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create instances of Professor and Secretary
        Professor prof1 = new Professor("Raju Tamang", LocalDate.now(), 10);
        Professor prof2 = new Professor("Jiwan Ghimire", LocalDate.now(), 8);
        Professor prof3 = new Professor("Rose Rana", LocalDate.now(), 12);

        Secretary sec1 = new Secretary("Jyoti Lama", LocalDate.now(), 5);
        Secretary sec2 = new Secretary("Shree Tripathi", LocalDate.now(), 8);

        // Create an array of department employees
        DeptEmployee[] department = new DeptEmployee[]{prof1, prof2, prof3, sec1, sec2};

        // Ask the user if they want to see the sum of all salaries
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to see the sum of all salaries? (Y/N): ");
        String response = scanner.nextLine().toUpperCase();

        if (response.equals("Y")) {
            // Calculate and display the sum of all salaries
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total Salary of all employees: " + totalSalary);
        }
    }
}
