package Task3_ATM_Interface;

public class BankAccount {

    private double balance = 5000;

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

            System.out.println("Amount Deposited: ₹" + amount);
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount <= balance) {

            balance -= amount;

            System.out.println("Amount Withdrawn: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);

        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
