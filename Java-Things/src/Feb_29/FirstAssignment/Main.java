package Feb_29.FirstAssignment;

public class Main {
    public static void main(String[] args) {
        Address chicagoAddress = new Address("123 Main St", "Chicago", "IL", "60601");

        Customer customer1 = new Customer("Kush", "Rimal", "123-45-6789");
        customer1.setBillingAddress(chicagoAddress);

        Customer customer2 = new Customer("Anoj", "Shrestha", "987-65-4321");
        customer2.setBillingAddress(new Address("456 Oak St", "New York", "NY", "10001"));

        Customer customer3 = new Customer("Suman", "Adhikari", "111-22-3333");
        customer3.setBillingAddress(new Address("789 Pine St", "Chicago", "IL", "60602"));

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}