package bank_exercise;

public class Checking extends Account {
    public Checking(String branchLocation) {
        super(branchLocation);
    }

    @Override
    public void checkBalance() {
        System.out.println("== Checking Account ==");
        super.checkBalance();
    }

    public void deposit(double amt) {
        this.balance += amt;
        System.out.printf("$%.2f deposited to the checking account.\n", amt);
        this.checkBalance();
    }

    public void withdraw(double amt) {
        if (amt >= this.balance) {
            this.balance -= amt;
            System.out.printf("$%.2f withdrawn checking account.\n", amt);
        } else {
            System.out.println("The current balance is smaller than the withdrawal amount requested.");
            System.out.printf("$%.2f withdrawn checking account.\n", this.balance);
        }
        this.checkBalance();
    }
}
