public class Account {
    //variables
    private double balance;
    private String accNum;
    private static int numberOfAccounts = 1000;

    //constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
        numberOfAccounts += 1;
        this.accNum = String.valueOf(numberOfAccounts);
    }

    //methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.printf("%.2f deposited into account %s. New balance: %.2f\n",amount,accNum,balance);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for transaction.");
        }
        else {
            balance = balance - amount;
            System.out.printf("%.2f withdrawn from account %s. New balance: %.2f\n",amount,accNum,balance);
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccNum() {
        return accNum;
    }
    @Override
    public String toString() {
        return String.format("Account No. %s | Balance: %.2f",accNum,balance);
    }
}