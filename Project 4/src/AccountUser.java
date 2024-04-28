public class AccountUser extends Account {
    public String userName;
    public AccountUser(double initialBalance, String userName) {
        super(initialBalance);
        this.userName = userName;
    }

    @Override
    public String toString() {
        return String.format("User Name: %s",userName);
    }
}
