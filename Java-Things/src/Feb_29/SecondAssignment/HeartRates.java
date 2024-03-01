package Feb_29.SecondAssignment;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    // Constants
    private static final int RESTING_HEART_RATE = 70;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter and Setter methods for attributes
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Method to calculate age using AgeCalculator class
    public int calculateAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        return ageCalculator.calculateAge(dateOfBirth).getYears();
    }

    // Method to calculate maximum heart rate
    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    // Method to calculate and print target heart rate range
    public void calculateAndPrintTargetHeartRate() {
        int averageHeartRate = calculateMaximumHeartRate() - RESTING_HEART_RATE;
        double lowerBoundaryTargetHeartRate = (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
        double upperBoundaryTargetHeartRate = (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;

        System.out.printf("The Target Heart Rate Range is between %.1f and %.15f%n",
                lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate);
    }

    public String toString() {
        return "First Name : " + firstName + "\n" +
                "Last Name : " + lastName + "\n" +
                "Age : " + calculateAge() + "\n" +
                "Date Of Birth : " + dateOfBirth + "\n" +
                "Maximum Heart Rate : " + calculateMaximumHeartRate();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please, enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please, enter your birthdate in the format -(yyyy-MM-dd) Example 1985-05-15: ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateStr);

        HeartRates person = new HeartRates(firstName, lastName, birthDate);

        System.out.println("The Target Heart Rate Range is between: ");
        person.calculateAndPrintTargetHeartRate();

        System.out.println(person.toString());
    }
}
