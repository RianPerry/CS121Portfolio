import java.util.HashMap;

public class Customer {
    //variables
    private String firstName;
    private String lastName;
    private String pin;
    private HashMap<String,Account> accMap = new HashMap<>();

    //constructor
    public Customer(String firstName,String lastName,String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    //methods
    public void addAcc(String accNum,Account account) {
        accMap.put(accNum,account);
    }
    public void closeAcc(String accNum) {
        accMap.remove(accNum);
    }
    public Account getAcc(String accNum) {
        Account foundAcc = null;
        if (accMap.containsKey(accNum)) {
            foundAcc = accMap.get(accNum);
        }
        return foundAcc;
    }
    public StringBuilder getAllAccs() {
        StringBuilder accs = new StringBuilder();
        accMap.forEach((accNum,acc) -> {
            accs.append(acc.toString());
        });
        return accs;
    }
    @Override
    public String toString() {
        return String.format("Name: %s %s | PIN: %s",firstName,lastName,pin);
    }
}
