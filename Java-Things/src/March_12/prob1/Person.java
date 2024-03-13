package March_12.prob1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    public String getLast() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
    }
}
