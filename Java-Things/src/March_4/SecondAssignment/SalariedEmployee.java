package March_4.SecondAssignment;

public class SalariedEmployee extends  Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    // Getters and Setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                ", weeklySalary=" + weeklySalary +
                '}';
    }
}
