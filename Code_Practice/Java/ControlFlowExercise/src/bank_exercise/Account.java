package bank_exercise;

public class Account extends Bank {
    protected double balance;

    public Account(String branchLocation) {
        super(branchLocation);
        this.balance = 0.00;
    }

    @Override
    public void checkBalance() {
        System.out.println("The current balance is " + this.balance);
    }
}
