package observer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("name1");

        Customer customer2 = new Customer();
        customer2.setCustomerName("name2");

        Product iphone = new Product();
        iphone.setProductName("iphone");
        iphone.setAvailable(false);

        iphone.registerObserver(customer1);
        iphone.registerObserver(customer2);

        iphone.setAvailable(true);
    }
}
