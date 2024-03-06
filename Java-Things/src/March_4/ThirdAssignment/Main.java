package March_4.ThirdAssignment;


public class Main {
    public static void main(String[] args) {
        // Creating Computer objects for testing
        Computer computer1 = new Computer("Microsoft Surface Pro 9", "Intel i7", 16, 3.5);
        Computer computer2 = new Computer("HP", "AMD Ryzen", 8, 2.8);

        // Comparing two Computer objects for equality
        boolean areEqual = computer1.equals(computer2);
        System.out.println("Are the computers equal? " + areEqual);

        // Printing hashCode values
        System.out.println("hashCode of computer1: " + computer1.hashCode());
        System.out.println("hashCode of computer2: " + computer2.hashCode());

        // Checking if the hashCodes are equal
        boolean hashCodesEqual = (computer1.hashCode() == computer2.hashCode());
        System.out.println("Are the hashCodes equal? " + hashCodesEqual);
    }
}