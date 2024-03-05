package March_4.SecondAssignment;

// Driver class
public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of five objects for various employee categories
        Employee[] employees = {
                new CommissionEmployee("John", "Doe", "123-45-6789", 50000, 10),
                new HourlyEmployee("Jane", "Smith", "987-65-4321", 15, 40),
                new SalariedEmployee("Bob", "Johnson", "234-56-7890", 800),
                new BasePlusCommissionEmployee("Alice", "Williams", "345-67-8901", 75000, 8, 2000),
                new HourlyEmployee("Charlie", "Brown", "456-78-9012", 20, 35)
        };

        // Print the current status of the objects
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        // Calculate and print the total salaries of all employees
        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.getPayment();
        }

        System.out.println("\nTotal Salaries of all employees: " + totalSalaries);
    }
}
