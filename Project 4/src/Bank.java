import java.util.HashMap;
public class Bank {
    //variables
    private HashMap<String,Customer> customerMap = new HashMap<>();

    //constructor - default
    public Bank(){}

    //methods
    public void addCustomer(String pin,Customer customer) {
        customerMap.put(pin,customer);
    }
    public void removeCustomer(String pin) {
        customerMap.remove(pin);
    }
    public Customer getCustomer(String pin) {
        Customer foundCustomer = null;
        if (customerMap.containsKey(pin)) {
            foundCustomer = customerMap.get(pin);
        }
        return foundCustomer;
    }
    public StringBuilder getAllCustomers() {
        StringBuilder customers = new StringBuilder();
        customerMap.forEach((pin,customer) -> {
            customers.append(String.format(customer.toString()));
        });
        return customers;
    }
}
