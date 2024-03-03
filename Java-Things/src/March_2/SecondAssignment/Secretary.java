package March_2.SecondAssignment;

import java.time.LocalDate;

public class Secretary extends  DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double overtimeHours) {
        super(name, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        // Salary includes regular pay plus 12 times overtime hours
        return super.computeSalary() + (12 * overtimeHours);
    }
}
