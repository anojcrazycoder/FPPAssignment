package March_4.SecondAssignment;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary + super.getPayment();
    }

    // Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                super.toString() +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
