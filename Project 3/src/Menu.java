import java.util.Scanner;

public class Menu {
    //variables
    private Scanner scnr = new Scanner(System.in);
    private Bank bank = new Bank();

    //constructor - default
    public Menu(){}

    //methods
    public void displayMenu() {
        while (true) {
            System.out.println("******** MENU ********\nPlease makes a selection:\n" +
                    "1) Access Account\n2) Open New Account\n3) Close All Accounts\n" +
                    "4) Exit");
            String select = scnr.nextLine();
            if (select.equals("1")) {
                accessAcc();
            }
            else if (select.equals("2")) {
                openAcc();
            }
            else if (select.equals("3")) {
                closeAllAccs();
            }
            else if (select.equals("4")) {
                System.out.println("Thank you for using BSU Banking.\nExiting...");
                break;
            }
            else {
                System.out.println("Invalid Request.");
            }
        }
    }
    private void accessAcc() {
        System.out.print("Enter PIN: ");
        String pin = scnr.nextLine();
        Customer customer = bank.getCustomer(pin);
        if (customer == null) {
            System.out.println("Invalid PIN.");
            return;
        }
        System.out.println(customer.getAllAccs());
        System.out.print("Enter the number of the account you would like to access: ");
        String accNum = scnr.nextLine();
        Account account = customer.getAcc(accNum);
        if (account == null) {
            System.out.println("Invalid Account Number");
            return;
        }
        while (true) {
            System.out.println("Please make a selection:\n1) Make a deposit\n" +
                    "2) Make a withdrawal\n3) See account balance\n4) Close account\n" +
                    "5) Exit");
            String select = scnr.nextLine();
            if (select.equals("1")) {
                System.out.print("Enter deposit amount: ");
                double deposit = Double.parseDouble(scnr.nextLine());
                account.deposit(deposit);
            }
            else if (select.equals("2")) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = Double.parseDouble(scnr.nextLine());
                account.withdraw(withdrawal);
            }
            else if (select.equals("3")) {
                double balance = account.getBalance();
                System.out.printf("Account Balance: %f\n", balance);
            }
            else if (select.equals("4")) {
                System.out.print("Enter account number to close: ");
                String close = scnr.nextLine();
                customer.closeAcc(close);
            }
            else if (select.equals("5")) {
                System.out.println("Exiting to main menu...");
                break;
            }
            else {
                System.out.println("Invalid Request.");
            }
        }
        return;
    }
    private void openAcc() {
        System.out.println("Are you a new customer?\n1) Yes\n2) No");
        String newCustomer = scnr.nextLine();
        if (newCustomer.equals("1")) {
            Customer customer = createNewCustomer();
            System.out.print("Enter initial deposit amount: ");
            double initialBalance = Double.parseDouble(scnr.nextLine());
            Account account = new Account(initialBalance);
            String accNum = account.getAccNum();
            customer.addAcc(accNum,account);
            System.out.printf("New account added: %s\n",accNum);
        }
        else if (newCustomer.equals("2")) {
            System.out.print("Enter PIN: ");
            String pin = scnr.nextLine();
            Customer customer = bank.getCustomer(pin);
            System.out.print("Enter initial deposit amount: ");
            double initialBalance = Double.parseDouble(scnr.nextLine());
            Account account = new Account(initialBalance);
            String accNum = account.getAccNum();
            customer.addAcc(accNum,account);
            System.out.printf("New account added: %s\n",accNum);
        }
        else {
            System.out.print("Invalid response.");
        }
    }
    private void closeAllAccs() {
        System.out.print("Enter PIN: ");
        String pin = scnr.nextLine();
        if (bank.getCustomer(pin) == null) {
            System.out.println("Customer not found.");
            return;
        }
        bank.removeCustomer(pin);
        System.out.println("Customer removed.");
    }
    private Customer createNewCustomer() {
        System.out.print("Enter First Name: ");
        String firstName = scnr.nextLine();
        System.out.print("Enter Last name: ");
        String lastName = scnr.nextLine();
        System.out.print("Create 4 digit PIN: ");
        String pin = scnr.nextLine();
        Customer customer = new Customer(firstName,lastName,pin);
        bank.addCustomer(pin,customer);
        return customer;
    }
}
