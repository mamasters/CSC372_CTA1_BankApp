public class BankAccount {
    private String firstName, lastName; // First and last name of the account owner.
    private int accountID; // Account ID number.
    private double balance; // Total $ in the account.
    public BankAccount(String firstName, String lastName, int accountID) {
        /*
         * Constructor, sets initial account balance to 0.
         */

        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0;
    }
    public double deposit(double depositAmount) {
        /*
         * Displays starting balance.
         * Subtracts an amount (passed as an argument) from the balance.
         * Displays new balance.
         */

        System.out.println("------------------------------------");
        System.out.printf("Your starting account balance is $%.2f\n", balance);
        balance = balance + depositAmount;
        System.out.println("You deposited $" + depositAmount);
        System.out.printf("Your new balance is $%.2f\n", balance);
        System.out.println("------------------------------------");
        return balance;
    }
    public double withdrawl(double withdrawAmount) {
        /*
         * Displays starting balance.
         * Subtracts an amount (passed as an argument) from the balance.
         * Displays new balance.
         */

        System.out.println("------------------------------------");
        System.out.printf("Your starting account balance is $%.2f\n", balance);
        balance = balance - withdrawAmount;
        System.out.printf("You deposited $%.2f\n", withdrawAmount);
        System.out.printf("Your new balance is $%.2f\n", balance);
        System.out.println("------------------------------------");
        return balance;
    }
    public void accountSummary() {
        /*
         * Prints out the account info.
         */

        System.out.printf("Name: %s %s\nAccount Number: %d\nAccount Balance: $%.2f",
                firstName, lastName, accountID, balance);
    }

    // Setter methods.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods.
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
}
